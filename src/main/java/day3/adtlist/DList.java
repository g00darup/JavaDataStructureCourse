package day3.adtlist;

public class DList {
    DNode header,trailer;
    int size;

    public DList() {
        this.header = null;
        this.trailer = null;
        this.size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size()==0;
    }

    DNode getPrev(DNode m) throws Exception {
        if(m==header)
            throw new Exception("List is Empty");
        return m.getPrev();
    }

    DNode getNext(DNode m) throws Exception {
        if(m==trailer)
            throw new Exception("List is Empty");
        return m.getNext();
    }

    void addFirst (DNode n) throws Exception {
        addAfter(header,n);
    }

    private void addAfter(DNode v, DNode z) throws Exception {
        DNode x = getNext(v);
        z.setPrev(v);
        x.setNext(z);
        x.setPrev(v);
        v.setNext(z);
        size++;
    }


}
