package com.bayudwiyansatria.environment.apache.hdfs;

import com.bayudwiyansatria.environment.apache.Hadoop;

public class HDFSConfiguration extends Hadoop {
    private static String HDFS_HOST = null;
    private static String HDFS_PORT = null;

    private static String FILE_PATH = null;
    private static String RESOURCES = null;
    private static String FILE_SYSTEM = null;

    public void setHDFSHost(String HDFSUrl){
         HDFS_HOST = HDFSUrl;
    }

    public void setHDFSPort(String HDFSPort){
         HDFS_PORT = HDFSPort;
    }

    public void setFilePath(String FilePath){
         FILE_PATH = FilePath;
    }

    public void setFileSystem(String FileSystem){
         FILE_SYSTEM = FileSystem;
    }

    public String getHDFSHost(){
        if(HDFS_HOST == null){
            setHDFSHost("127.0.1.1");
        }
        return HDFS_HOST;
    }

    public String getHDFSPort(){
        if(HDFS_PORT == null){
            setHDFSPort("9000");
        }
        return HDFS_PORT;
    }

    public String getFilePath(){
        return FILE_PATH;
    }

    public String getFileSystem(){
        return FILE_SYSTEM;
    }
}
