public class MyLinkedList<E> {
    private MyNode<E> head;
    private int numNode;

    public MyLinkedList() {

    }
    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
        this.numNode++;
    }

    public void add(int index, E data) {
        MyNode<E> node = new MyNode<>(data);
        MyNode<E> temp = head;
        MyNode<E> holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = node;
        temp.next.next = holder;
        numNode++;
    }
    public void addFirst(E data) {
        MyNode<E> node = new MyNode<>(data);
        MyNode<E> temp = head;
        head = node;
        head.next = temp;
        numNode++;
    }
    public E get(int index) {
        MyNode<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp;
    }
    public void printList() {
        MyNode<E> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
