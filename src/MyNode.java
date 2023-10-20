
public class MyNode<E> {
    public MyNode<E> next;
    public E data;

    public MyNode(E data) {
        this.data = data;
    }
    public Object getData() {
        return this.data;
    }
}
