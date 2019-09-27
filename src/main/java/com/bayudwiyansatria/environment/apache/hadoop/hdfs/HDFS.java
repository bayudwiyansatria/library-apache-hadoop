package com.bayudwiyansatria.environment.apache.hdfs;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;

import java.net.URI;

public class HDFS extends HDFSConfiguration {


    public String getHDFS(){
        String HdfsURL = "com.bayudwiyansatria.environment.apache.hdfs://" + this.getHDFSHost()+ ":" + this.getHDFSPort();
        if(getUsername().equals(System.getProperty("user.name"))){
            return HdfsURL +"/home/"+ getUsername() +"/";
        } else if ((!getUsername().equals(System.getProperty("user.name"))) && (getUsername()!= null)){
            return HdfsURL +"/home/"+ getUsername() +"/";
        } else {
            return HdfsURL +"/";
        }
    }

    public void makeDir(String Source, String Destination){
        try {
            FileSystem fs = FileSystem.get(URI.create(getHDFS()), getHadoopConfiguration());
            fs.copyFromLocalFile(new Path(Source), new Path(Destination));
            Logger.getLogger("ERROR");
        } catch (Exception exception){
            System.out.println("Error :"+ exception);
        }

    }

    public void putFile(String Source, String Destination){
        try {
            FileSystem fs = FileSystem.get(URI.create(getHDFS()), getHadoopConfiguration());
            fs.copyFromLocalFile(new Path(Source), new Path(Destination));
            System.out.println("Success Put File To " + Destination);
        } catch (Exception exception){
            System.out.println("Error :"+ exception);
        }
    }

    public void moveFile(String Source, String Destination){
        try {
            FileSystem fs = FileSystem.get(URI.create(getHDFS()), getHadoopConfiguration());
            fs.moveFromLocalFile(new Path(Source), new Path(Destination));
            Logger.getLogger("ERROR");
        } catch (Exception exception){
            System.out.println("Error :");
        }
    }

    public void removeFile(String filename){
        try {
            Path file = new Path(filename);
            FileSystem fs = FileSystem.get(URI.create(getHDFS()), getHadoopConfiguration());
            System.out.println("Success Remove File To " + getHDFS() + filename);
            if(fs.exists(file)){
                fs.delete(file,false);
            }
            Logger.getLogger("ERROR");
        } catch (Exception exception){
            System.out.println("Error :"+ exception);
        }
    }




}
