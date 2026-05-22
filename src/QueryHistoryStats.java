import java.util.HashMap;

public class QueryHistoryStats  {
    public static void main(String[] args){
        String[] queryHistory = {"show users", "show files", "show users", "count rows", "show files", "show users"};
        HashMap<String, Integer> stats = WordCountDemo.countWord(queryHistory);
        for(String query: stats.keySet()){
            System.out.println(query + " -> " + stats.get(query));
        }
    }
}
