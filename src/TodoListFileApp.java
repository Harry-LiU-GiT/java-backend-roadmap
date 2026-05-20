import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;

public class TodoListFileApp {
    public static void main(String[] args) throws IOException{
        Path path = Path.of("tasks.txt");
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Learn Java IO");
        tasks.add("Practice exceptions");
        tasks.add("Update README");
        saveTasks(tasks, path);
        ArrayList loadTasks = new ArrayList(loadTasks(path));
        System.out.println(loadTasks);
    }

    public static void saveTasks(ArrayList<String> tasks, Path path)throws IOException{
        Files.write(path, tasks);
    }

    public static ArrayList<String> loadTasks(Path path)throws IOException{
        return new ArrayList<>(Files.readAllLines(path));
    }
}
