package Stack;

import java.util.Stack;

public class displayStack {

    public static void displayReverseRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        System.out.println(top+" ");
        displayReverseRec(s);
        s.push(top);
        System.out.println();
    }

    public static void displayRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        displayRec(s);
        System.out.println(top);
        s.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayReverseRec(st);
        displayRec(st);
    }

}
