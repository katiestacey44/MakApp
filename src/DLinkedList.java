// Define the Node class to represent individual elements in the doubly linked list.
// Define the Node class to represent individual elements in the doubly linked list.
class Node {
    int data;    // Data stored in the node
    Node prev;   // Reference to the previous node
    Node next;   // Reference to the next node
    Node forward; // Reference to the forward node (used in the binary tree)
    Node left;    // Reference to the left node (used in the binary tree)
    Node right;   // Reference to the right node (used in the binary tree)

    // Constructor to create a new node with the given data
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
        this.left = null;
        this.right = null;
    }

}

// Define the DoublyLinkedList class to manage the linked list.
class DoublyLinkedList {
    Node head;   // Reference to the first node (head)
    Node tail;   // Reference to the last node (tail)

    // Constructor to create an empty doubly linked list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to append a new element to the end of the list.
    public void end(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node both head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Update the links for the new node and the current tail
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;  // Update the tail to the new node
        }
    }

    // Method to prepend a new element to the beginning of the list.
    public void beginning(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node both head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Update the links for the new node and the current head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;  // Update the head to the new node
        }
    }


    // Method to display the elements in the doubly linked list from head to tail.
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DLinkedList{
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.end(102);
        myList.end(104);
        myList.end(110);
        myList.end(112);


        Node node114 = new Node(114);
        Node node120 = new Node(120);
        Node node140 = new Node(140);
        Node node130 = new Node(130);

        node114.next = node120;
        node114.left = node140;
        node114.right = node130;

        myList.end(node114.data);


        myList.end(114);
        myList.end(120);
        myList.end(130);
        myList.end(140);
        myList.end(126);
        myList.end(127);
        myList.end(125);
        myList.end(132);
        myList.end(133);
        myList.end(124);
        myList.end(123);
        myList.end(122);
        myList.end(121);
        myList.end(146);
        myList.end(145);
        myList.end(144);
        myList.end(143);
        myList.end(142);
        myList.end(141);
        myList.end(155);
        myList.end(154);
        myList.end(153);
        myList.end(152);
        myList.end(151);
        myList.end(150);
        myList.end(156);
        myList.end(157);


        System.out.print("Doubly Linked List: ");
        myList.display();


        System.out.print("Updated List: ");
        myList.display();
    }
}
