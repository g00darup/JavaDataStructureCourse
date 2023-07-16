package day3.adtlist;

public class SLinkedList<T>{
    protected Node head;
    protected long size;

    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }
    public SLinkedList(Node head, long size) {
        this.head = head;
        this.size = size;
    }
    public SLinkedList() {
        this.head = null;
        this.size = 0;
    }

    void addFirst(Node n){
        n.setNext(head);
        head = n;
    }

    int size (Node head){
        if(head.getNext()==null)
            return 1;
        else
            return 1+size(head.getNext());
    }

    void addLast(Node n){
        Node p =head;
        while (p.getNext()!=null){
            p = p.getNext();
        }
        p.setNext(n);
        //n.setNext(null);
    }


}
