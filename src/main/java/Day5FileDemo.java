import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Day5FileDemo {
    public static void main(String[] args) throws IOException{
        Path path = Path.of("day5-notes.txt");
        Files.writeString(path, "Day 5 Java IO Practice");
        String content = Files.readString(path);
        System.out.println(content);
    }
}
