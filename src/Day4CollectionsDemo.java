import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Day4CollectionsDemo {
    public static void main(String[] args){
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Learn Java");
        tasks.add("Practice LeetCode");
        tasks.add("Write README");
        tasks.set(1, "Practice ArrayList");
        tasks.remove("Write README");
        System.out.println(tasks);
        HashMap<Integer, String> taskMap = new HashMap<>();
        taskMap.put(1, "Learn Java");
        taskMap.put(2, "Practice ArrayList");
        taskMap.put(3, "Write README");
        System.out.println(taskMap.get(2));
        System.out.println(taskMap.containsKey(3));
        HashSet<String> tags = new HashSet<>();
        tags.add("Java");
        tags.add("backend");
        tags.add("Java");
        System.out.println(tags.size());
        System.out.println(tags.contains("backend"));
        LinkedList<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println(queue.getFirst());
        queue.removeFirst();
        System.out.println(queue);
    }
}
