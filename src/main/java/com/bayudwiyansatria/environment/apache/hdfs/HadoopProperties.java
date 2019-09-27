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
