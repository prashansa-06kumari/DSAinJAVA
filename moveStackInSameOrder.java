package Stack;

import java.util.Stack;
import java.util.Scanner;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        //reverse order
        Stack<Integer> gt = new Stack<>();
        //while(!st.isEmpty())
        while(st.size() > 0){
            gt.push(st.pop());
        }
        System.out.println(gt);


        Stack<Integer> rt = new Stack<>();
        //while(!gt.isEmpty())

        while(gt.size() > 0){
            rt.push(gt.pop());
        }
        System.out.println(rt);













        //reverse order
//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());

//            int x = st.peek();
//            rt.push(x);
//            st.pop();
//        }
//        System.out.println(rt);






//how to input ourselves
//        int n;
//        System.out.println("Enter number of elements;");
//        n = sc.nextInt();
//        System.out.println("Enter elements:");
//        for(int i = 1; i <= n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
    }
}
