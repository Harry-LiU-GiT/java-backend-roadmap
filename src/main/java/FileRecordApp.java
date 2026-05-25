public class FileRecordApp {
    public static void main(String[] args){
        FileRecordManager manager = new FileRecordManager();
        FileRecord record1 = new FileRecord( 1, "users.csv", "csv", 1024, "2026-05-25");
        FileRecord record2 = new FileRecord(2, "orders.xlsx", "xlsx", 2048, "2026-05-25");
        manager.addRecord(record1);
        manager.addRecord(record2);
        manager.printAll();
        FileRecord found = manager.findById(1);
        if (found != null) {
            found.printInfo();
        }
        manager.removeById(1);
        manager.printAll();
    }
}
