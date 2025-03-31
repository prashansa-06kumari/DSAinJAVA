//delete middle element - if string
package Stack;

import java.util.Stack;




public class deleteUsingAnotherStack{



    public static void deleteMiddle (Stack<Character> st){
        Stack<Character> temp = new Stack<>();
        int size = st.size();
        int mid = size / 2;
        for(int i = 0; i < mid; i++){
            temp.push(st.pop());
        }

        st.pop();

        while(temp.size() > 0){
            st.push(temp.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');

        System.out.println("Original Stack: " + st);
        deleteMiddle(st);

        System.out.println("Removing middle: " + st);
    }
}
































//delete middle element - non-string


//public class deleteUsingAnotherStack {
//
//
//    public static void deleteMiddle(Stack<Integer> st){
//        int size = st.size();
//        int mid = size / 2;
//
//        Stack<Integer> temp = new Stack<>();
//        while(st.size() > mid){
//            temp.push(st.pop());
//        }
//        st.pop();
//        while(temp.size() > 0){
//            st.push(temp.pop());
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        st.push(6);
//        st.push(7);
//
//        System.out.println("Original stack: " + st);
//        deleteMiddle(st);
//        System.out.println("After deleted: " + st);
//    }
//}
