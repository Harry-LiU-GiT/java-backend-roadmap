import java.util.ArrayList;
public class TodoListApp {
    public static void main(String[] args){
        ArrayList<String> tasks = new ArrayList<>();
        addTask(tasks, "Learn Java");
        addTask(tasks, "Practice Collections");
        addTask(tasks, "Write README");
        printTasks(tasks);
        removeTask(tasks, 2);
        printTasks(tasks);
    }
    public static void addTask(ArrayList<String> tasks, String task){
        tasks.add(task);
    }
    public static void removeTask(ArrayList<String> tasks, int index){
        tasks.remove(index - 1);
    }
    public static void printTasks(ArrayList<String> tasks){
        for(int i = 0; i < tasks.toArray().length; i++){
            int j = i + 1;
            System.out.println(j + "." + tasks.toArray()[i]);
        }
    }

}
