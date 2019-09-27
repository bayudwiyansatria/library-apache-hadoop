package com.bayudwiyansatria.environment.apache.hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

public class HDFSReader {

    protected Configuration conf;
    protected FileSystem hdfs;

    public HDFSReader() throws IOException {
        conf = new Configuration();
        conf.setBoolean("dfs.support.append", true);
        hdfs = FileSystem.get(conf);
    }

}
