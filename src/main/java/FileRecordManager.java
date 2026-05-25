import java.util.ArrayList;

public class FileRecordManager {
    private ArrayList<FileRecord> records;

    public FileRecordManager(){
        this.records = new ArrayList<>();
    }

    public void addRecord(FileRecord record){
        this.records.add(record);
    }

    public void printAll(){
        for(FileRecord record : records){
            record.printInfo();
        }
    }

    public FileRecord findById(int id){
        for(FileRecord record : this.records){
            if(record.getId() == id){
                return record;
            }
        }
        return null;
    }

    public void removeById(int id){
        FileRecord record = findById(id);
        if(record != null){
            this.records.remove(record);
        }
    }
}
