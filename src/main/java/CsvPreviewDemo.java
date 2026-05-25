import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvPreviewDemo {
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("data/sample.csv"))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null && count < 5){
                System.out.println(line);
                count++;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
