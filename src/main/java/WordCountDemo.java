import java.util.HashMap;

public class WordCountDemo {
    public static void main(String[] args){
    String[] words = {"java", "spring", "java", "redis", "mysql", "spring", "java"};
    System.out.println(countWord(words));
    }

    public static HashMap<String, Integer> countWord(String[] words){
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(map.containsKey(word)){
                int temp = map.get(word);
                map.put(word, temp + 1);
            }
            else{
                map.put(word, 1);
            }
        }
        return map;
    }
}
