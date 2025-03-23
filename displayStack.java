package Stack;

import java.util.Stack;

public class displayStack {
    public static void displayReverseRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        System.out.print(top+" ");
        displayReverseRec(s);
        s.push(top);

    }
    public static void displayRec(Stack<Integer> s){
        if(s.size() == 0) return;
        int top = s.pop();
        displayReverseRec(s);
        System.out.println(top+" ");

        s.push(top);

    }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st);
        displayReverseRec(st);
        displayRec(st);
//        System.out.println(st);

        //through stack
//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());
//
//        }
//        while(rt.size() > 0){
//            int x = rt.pop();
//            System.out.println(x + " ");
//            st.push(x);
//        }

        //through array
//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i = n - 1; i >= 0; i--){
//            arr[i] = st.pop();
//
//        }
//        for(int i = 0; i<n; i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }

    }

}
