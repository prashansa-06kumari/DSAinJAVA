package Stack;
import java.util.Stack;


public class BalancedBrackets {
    public static boolean isBoolean(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch =='[' || ch == '('){
                st.push(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')'){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        if(isBoolean(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
