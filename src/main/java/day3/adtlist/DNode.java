package day3.adtlist;

public class DNode<T> {


    public DNode(DNode next, DNode prev, T item) {
        this.next = next;
        this.prev = prev;
        Item = item;
    }

    DNode next;

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public T getItem() {
        return Item;
    }

    public void setItem(T item) {
        Item = item;
    }

    DNode prev;
    T Item;

}
