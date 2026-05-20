import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));

    }

    public static String sortString(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        return key;
    }

    public static HashMap<String, ArrayList<String>> groupAnagrams(String[] words){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String key = sortString(word);
            if(map.containsKey(key)){
                map.get(key).add(word);
            }
            else{
                map.put(key, new ArrayList<>());
                map.get(key).add(word);
            }
        }
        return map;
    }
}
