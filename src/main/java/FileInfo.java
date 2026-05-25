public class FileInfo implements Printable {
    private int id;
    private String fileName;
    private String fileType;
    private long size;

    public FileInfo(int id, String fileName, String fileType, long size){
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.size = size;
    }

    public void printInfo(){
        System.out.println(id + " " + fileName + " " + fileType + " " + size);
    }

    public int getId(){
        return this.id;
    }

    public String getFileName(){
        return this.fileName;
    }

    public String getFileType(){
        return this.fileType;
    }

    public long getSize(){
        return this.size;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void setFileType(String fileType){
        this.fileType = fileType;
    }

    public void setSize(long size){
        this.size = size;
    }
}
