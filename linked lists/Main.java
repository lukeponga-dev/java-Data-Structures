public class Main {
    public static void main(String[] args) {

        System.out.println("Linked List");

        IntLinkedList intLinkedList = new IntLinkedList();

        intLinkedList.add(2);
        intLinkedList.add(3);
        intLinkedList.add(1);
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.print();
        intLinkedList.remove(2);
        intLinkedList.print();
        intLinkedList.remove(1);
        intLinkedList.print();
        intLinkedList.insert(1);
        intLinkedList.insert(2);
        intLinkedList.print();

        System.out.println("Is Empty? " + intLinkedList.isEmpty());
        System.out.println("Has Value? " + intLinkedList.hasValue(5));
        System.out.println("List Length? " + intLinkedList.getLength());

    }
}