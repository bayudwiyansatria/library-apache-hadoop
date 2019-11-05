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
import com.bayudwiyansatria.Core;

public class HadoopProperties extends Core {
    private String CoreXML = null;
    private String YarnXML = null;
    private String HdfsXML = null;
    private String MapReduceXML = null;
    private String log4j = null;

    public void setResourceCore(String CoreXML){
        this.CoreXML = CoreXML;
    }

    public void setResourceYarn(String YarnXML){
        this.YarnXML = YarnXML;
    }

    public void setResourceHDFS(String HDFSXML){
        this.HdfsXML = HDFSXML;
    }

    public void setResourceMapReduce(String MapReduceXML){
        this.MapReduceXML = MapReduceXML;
    }

    public void setLogProperties(String Log4jPropertiesFile){
        this.log4j = Log4jPropertiesFile;
    }

    public String getResourceCore(){
        if(CoreXML == null){
            setResourceCore("conf/core-site.xml");
        }
        return CoreXML;
    }

    public String getResourceYarn(){
        if(YarnXML == null){
            setResourceYarn("conf/yarn-site.xml");
        }
        return YarnXML;
    }

    public String getResourceHDFS(){
        if(HdfsXML == null){
            setResourceHDFS("conf/hdfs-site.xml");
        }
        return HdfsXML;
    }

    public String getResourceMapReduce(){
        if(MapReduceXML == null){
            setResourceMapReduce("conf/mapred-site.xml");
        }
        return MapReduceXML;
    }

    public String getLogProperties(){
        if(log4j == null){
            setLogProperties("conf/log4j.properties");
        }
        return log4j;
    }



}
