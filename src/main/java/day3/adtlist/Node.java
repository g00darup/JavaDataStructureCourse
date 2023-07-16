package day3.adtlist;

public class Node<T>{
    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }
//    private Node(){
//        this.item = null;
//        this.next = null;
//    }
    private T item;
    private Node next;
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
