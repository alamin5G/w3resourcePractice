package java_basic_1;


public class RemoveDuplicateFromSortedLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(11);
        list.print();
        System.out.println("After removing the duplicate: ");
        list.remove();
        list.print();
    }
}

class LinkedList {
    Node head;
    Node tail;

    private static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node temp = head;
       while (temp.next != null) {
           temp = temp.next;
       }
       temp.next = newNode;
       tail = newNode;

    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void remove() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            if (temp.next != null) {
                temp = temp.next;
            }
        }
    }
}
