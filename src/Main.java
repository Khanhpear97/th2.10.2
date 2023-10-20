public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst( 10);
        myLinkedList.addFirst( 11);
        myLinkedList.addFirst( 12);
        myLinkedList.addFirst( 13);

        myLinkedList.add(4, 9);
        myLinkedList.add(4, 7);
        myLinkedList.printList();
    }
}