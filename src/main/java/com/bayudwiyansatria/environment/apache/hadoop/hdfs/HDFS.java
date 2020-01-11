/*
 * MIT License
 *
 * Copyright (c) 2019 Bayu Dwiyan Satria
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bayudwiyansatria.environment.apache.hadoop.hdfs;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;

import java.net.URI;

public class HDFS extends HDFSConfiguration {

    public String getHDFS(){
        String HdfsURL = "hdfs://" + this.getHDFSHost()+ ":" + this.getHDFSPort();
        if(System.getProperty("user.name").equals(new com.bayudwiyansatria.Core ().getSystemUsername ())){
            return HdfsURL +"/home/"+ System.getProperty("user.name") +"/";
        } else if ((!System.getProperty("user.name").equals(new com.bayudwiyansatria.Core ().getSystemUsername ())) && (new com.bayudwiyansatria.Core ().getSystemUsername ()!= null)){
            return HdfsURL +"/home/"+ new com.bayudwiyansatria.Core ().getSystemUsername () +"/";
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
            //System.out.println("Success Put File To " + Destination);
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
            //System.out.println("Success Remove File To " + getHDFS() + filename);
            if(fs.exists(file)){
                fs.delete(file,false);
            }
            Logger.getLogger("ERROR");
        } catch (Exception exception){
            System.out.println("Error :"+ exception);
        }
    }




}
