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

package com.bayudwiyansatria.environment.apache.hadoop;

public class HadoopConfiguration extends HadoopProperties{

    private String HADOOP_OS;
    private String HADOOP_MAP_REDUCE_OS;
    private int HADOOP_MAX_ATTEMPT;

    public void setProperties(){
        System.setProperty("HADOOP_USER_NAME", System.getProperty("user.name"));
        this.getLogProperties();
    }

    public void setHadoopOS(String OS){
        String newOS;
        String parseOS = OS.toLowerCase();
        if(parseOS.equals("linux")){
            newOS = "Linux";
        } else if (parseOS.equals("windows") || parseOS.equals("window")){
            newOS = "Windows";
        } else if(parseOS.equals("macos") || parseOS.equals("mac") || parseOS.equals("macosx")){
            newOS = "MacOS";
        } else {
            newOS = "Linux";
        }
        this.HADOOP_OS = newOS;
    }

    public void setMapReduceOS(String MapReduceOS){
        String newOS;
        String parseOS = MapReduceOS.toLowerCase();
        if(parseOS.equals("linux")){
            newOS = "Linux";
        } else if (parseOS.equals("windows") || parseOS.equals("window")){
            newOS = "Windows";
        } else if(parseOS.equals("macos") || parseOS.equals("mac") || parseOS.equals("macosx")){
            newOS = "MacOS";
        } else {
            newOS = "Linux";
        }
        this.HADOOP_MAP_REDUCE_OS = newOS;
    }

    public void setMaxAttempts(int NumberOfAttempt){
        this.HADOOP_MAX_ATTEMPT = NumberOfAttempt;
    }


    public String getOS(){
        if (HADOOP_OS == null) {
            HADOOP_OS = "Linux";
        }
        return HADOOP_OS;
    }

    public String getMapredOS(){
        if (HADOOP_MAP_REDUCE_OS == null) {
            this.HADOOP_MAP_REDUCE_OS = "Linux";
        }
        return HADOOP_MAP_REDUCE_OS;
    }

    public int getMaxAttempts(){
        if (HADOOP_MAX_ATTEMPT < 1) {
            HADOOP_MAX_ATTEMPT = 1;
        }
        return HADOOP_MAX_ATTEMPT;
    }

    public void getProperties(){
        System.out.println("HADOOP_USER_PROPERTIES"+":"+System.getProperty("user.name"));
    }

}
