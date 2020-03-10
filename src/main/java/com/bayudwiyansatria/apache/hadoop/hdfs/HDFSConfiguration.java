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

package com.bayudwiyansatria.apache.hadoop.hdfs;

import com.bayudwiyansatria.apache.hadoop.Hadoop;

public class HDFSConfiguration extends Hadoop {
    private static String HDFS_HOST = null;
    private static String HDFS_PORT = null;

    private static String FILE_PATH = null;
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
            setHDFSHost(new com.bayudwiyansatria.network.Network ().getIPv4AddressByInterface ( "ens33" ));
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
