public class Main {
    public static void main(String[] args) {

        System.out.println("Linked List");

        IntLinkedList intLinkedList = new IntLinkedList();

        intLinkedList.add(10);
        intLinkedList.add(20);
        intLinkedList.add(30);
        intLinkedList.add(40);
        intLinkedList.add(50);
        intLinkedList.print();
        intLinkedList.remove(50);
        intLinkedList.print();
        intLinkedList.remove(10);
        intLinkedList.print();
        intLinkedList.insert(10);
        intLinkedList.insert(50);
        intLinkedList.print();

        System.out.println("Is Empty? " + intLinkedList.isEmpty());
        System.out.println("Has Value? " + intLinkedList.hasValue(10));
        System.out.println("List Length? " + intLinkedList.getLength());

    }
}