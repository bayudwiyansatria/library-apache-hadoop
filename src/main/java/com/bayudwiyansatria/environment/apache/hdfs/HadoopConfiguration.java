public class HadoopConfiguration extends HadoopProperties{

    private String HADOOP_OS;
    private String HADOOP_MAP_REDUCE_OS;
    private int HADOOP_MAX_ATTEMPT;

    public void setProperties(){
        System.setProperty("HADOOP_USER_NAME", getUsername());
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
        System.out.println("HADOOP_USER_PROPERTIES"+":"+getUsername());
    }

}
