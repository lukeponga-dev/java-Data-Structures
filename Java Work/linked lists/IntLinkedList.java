import java.security.Identity;
import java.util.Currency;
import java.util.spi.ToolProvider;

import javax.crypto.Cipher;

public class IntLinkedList {
    Node head;

    public IntLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /* Go through linked list check if node has value */
    public boolean hasValue(int x) {
        Node current = head;
        while (current != null) {
            if (current.value == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /** Get List Length */
    public int getLength() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void add(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void remove(int x) {
        if (isEmpty()) {
            return;
        }
        if (!hasValue(x)) {
            return;
        }
        // Remove head
        if (head.value == x) {
            head = head.next;
        }

        // Removde middle
        Node previous = head;
        Node current = head.next;
        while (current != null) {
            if (current.value == x) {
                Node toRemove = current;
                previous.next = toRemove.next;
                current = toRemove.next;

            } else {
                previous = previous.next;
                current = current.next;
            }
        }
    }

    /** Ordered insert */
    public void insert(int x) {
        Node current;
        Node newNode = new Node(x);

        if (head == null || head.value <= newNode.value) {
            newNode.next = head;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && current.next.value > newNode.value)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "-> ");
            current = current.next;
        }
        System.out.println();
    }
}
