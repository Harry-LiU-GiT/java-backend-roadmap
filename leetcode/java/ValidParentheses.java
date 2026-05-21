import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args){
        String[] tests ={"()", "()[]{}", "{[]}", "(]", "([)]", "("};
        for(int i = 0; i < tests.length; i++) {
            String s = tests[i];
            boolean isValid = isValid(s);
            System.out.println(isValid);
        }
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('(');
            }
            if (c == '[') {
                stack.push('[');
            }
            if (c == '{') {
                stack.push('{');
            }
            if (c == ')') {
                if(stack.isEmpty()){
                    return false;
                }
                if (stack.peek() == '(') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            if (c == ']') {
                if(stack.isEmpty()){
                    return false;
                }
                if (stack.peek() == '[') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            if (c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '{') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
