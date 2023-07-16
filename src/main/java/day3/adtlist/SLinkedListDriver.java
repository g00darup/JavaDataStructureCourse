package day3.adtlist;

public class SLinkedListDriver {


    public static void main(String[] args) {
        Node n3 = new Node(new String("ATL"),null);
        Node n2 = new Node(new String("SFO"),n3);
        Node n1 = new Node(new String("NYC"),n2);
        //L.head.setNext(null);
        printList(n1);
        // Node n2 = new Node(new Integer(6),L.head.getNext());
    }
    private static void printList(Node head) {
        while(head !=null){
            System.out.println(head.getItem());
            head = head.getNext();
        }
    }
}
