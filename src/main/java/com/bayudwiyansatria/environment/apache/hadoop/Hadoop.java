package com.bayudwiyansatria.environment.apache.hadoop;

import org.apache.hadoop.conf.Configuration;

public class Hadoop extends HadoopConfiguration{
    public Configuration hadoopConfiguration;

    public Configuration getHadoopConfiguration(){
        this.hadoopConfiguration = new Configuration();
        this.hadoopConfiguration.addResource(getResourceCore());
        this.hadoopConfiguration.addResource(getResourceYarn());
        this.hadoopConfiguration.addResource(getResourceHDFS());
        this.hadoopConfiguration.addResource(getResourceMapReduce());
        this.hadoopConfiguration.addResource(getLogProperties());
        return hadoopConfiguration;
    }



}
