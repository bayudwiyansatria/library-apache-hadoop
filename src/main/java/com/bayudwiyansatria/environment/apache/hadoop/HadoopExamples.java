package com.bayudwiyansatria.environment.apache.hadoop;

import com.bayudwiyansatria.environment.apache.hadoop.hdfs.HDFS;

public class HadoopExamples {
    public static void main(String[] args){
        System.out.println("##############################################################");
        System.out.println("##       Bayu Dwiyan Satria - Apache Hadoop Environment     ##");
        System.out.println("##############################################################");

        Hadoop hadoop = new com.bayudwiyansatria.environment.apache.hadoop.Hadoop();
        HDFS hdfs = new com.bayudwiyansatria.environment.apache.hadoop.hdfs.HDFS();
        new com.bayudwiyansatria.mat.Mat().print(hdfs.getHDFS());
    }
}
