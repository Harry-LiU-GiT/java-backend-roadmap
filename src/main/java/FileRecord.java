public class FileRecord {
    private int id;
    private String fileName;
    private String fileType;
    private long size;
    private String uploadedAt;

    public FileRecord(int id, String fileName, String fileType, long size, String uploadedAt){
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.size = size;
        this.uploadedAt = uploadedAt;
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

    public String getUploadedAt(){
        return this.uploadedAt;
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

    public void setUploadedAt(String uploadedAt){
        this.uploadedAt = uploadedAt;
    }

    public void printInfo(){
        System.out.println(id + " | " + fileName + " | " + fileType + " | " + size + " | " + uploadedAt);
    }
}
