package day3.adtlist;

public class DNodeDriver {
    public static void main(String[] args) {

    DNode n3 = new DNode<>(null,null,"ATL");
    DNode n2 = new DNode(null,null,"SFO");
    DNode n1 = new DNode(null,null,"NYC");

    n1.setNext(n2);

    n2.setNext(n3);
    n2.setPrev(n1);

    n3.setPrev(n2);

    }
}
