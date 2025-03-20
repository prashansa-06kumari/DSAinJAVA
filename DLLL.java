package LinkedListt;

//insert at last point
public class DLLL {

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }


    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }


    private class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }
}

class Main6{
    public static void main(String[] args) {
        DLLL list = new DLLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(96);

        list.display();
    }
}


