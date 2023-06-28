package gr.uaeb.cf.ch19;

public class NodeGeneric<T> {

    private NodeGeneric<T> next ;
    private NodeGeneric<T> prev ;



    private T value ;
    public  NodeGeneric(){}

    public NodeGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    public NodeGeneric<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeGeneric<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "NodeGeneric{" +
                "value=" + value +
                '}';
    }
}
