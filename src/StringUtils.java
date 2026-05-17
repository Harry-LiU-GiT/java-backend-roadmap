public class StringUtils {
    public static void main(String[] args){
    System.out.println(reverse("java"));
    System.out.println(countChar("hello java", 'a'));
    }
    public static String reverse(String text){
        StringBuilder reversed_text = new StringBuilder();
        for(int i = text.length() - 1;i >= 0;i--){
            reversed_text.append(text.charAt(i));
        }
        return reversed_text.toString();
    }
    public static int countChar(String text, char target){
        int counter = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == target){
                counter += 1;
            }
        }
        return counter;
    }
}
