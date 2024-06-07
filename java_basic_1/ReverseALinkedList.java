package java_basic_1;

import org.w3c.dom.Node;

public class ReverseALinkedList {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.add(20); //20->null;
        ll.add(40); //20->40->null;
        ll.add(60); //20->40->60->null;
        ll.add(80); //20->40->60->80->null;
        ll.display();
        System.out.println("After reverse");
        ll.reverse();
        ll.display();
        System.out.println("Again reverse");
        ll.reverse();
        ll.display();

    }
}

class LinkList{
    private Node head;
    private Node tail;
    private int size;
    public LinkList(){
        head = null;
        tail = null;
        size = 0;
    }

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        Node current = head;
        Node temp = null;
        Node prev = null;

        while(current != null){
            temp  = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        //assigning the new head value
        head = prev;

    }

    public int length(){
        return size;
    }


}
