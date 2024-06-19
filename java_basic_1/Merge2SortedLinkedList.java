package java_basic_1;

public class Merge2SortedLinkedList {

    public static void main(String[] args) {
        LinkedLists list1 = new LinkedLists();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(6);
        list1.printList();
        LinkedLists list2 = new LinkedLists();
        list2.insert(2);
        list2.insert(4);
        list2.insert(5);
        list2.printList();
        LinkedLists list3 = new LinkedLists().merge(list1, list2);
        System.out.println("After merging the 2 sorted linked list: ");
        list3.printList();

    }

}

class LinkedLists {
    Node head;
    Node tail;
    int size;

    public LinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public LinkedLists merge(LinkedLists list1, LinkedLists list2) {
        LinkedLists mergedList = new LinkedLists();
        if (list1.head == null && list2.head == null) {
            mergedList.head = list1.head;
            return mergedList;
        }

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        int c = list1.size + list2.size;
        while (c != 0 || temp1 != null || temp2 != null) {

            c--;
            if (temp1 == null) {
                if (temp2 != null) {
                    mergedList.tail.next = temp2;
                    mergedList.tail = temp2;
                    temp2 = temp2.next;

                }
                continue;
            }

            if (temp2 == null) {
                if (temp1 != null) {
                    mergedList.tail.next = temp1;
                    mergedList.tail = temp1;
                    temp1 = temp1.next;

                }
                continue;
            }

            if (mergedList.head == null && temp1.data >= temp2.data) {
                mergedList.head = temp2;
                mergedList.tail = temp2;
                temp2 = temp2.next;
            }else if(mergedList.head == null){
                mergedList.head = temp1;
                mergedList.tail = temp1;
                temp1 = temp1.next;
            }else if(temp2.data > temp1.data){
                mergedList.tail.next = temp1;
                mergedList.tail = temp1;
                temp1 = temp1.next;
            }else {
                mergedList.tail.next = temp2;
                mergedList.tail = temp2;
                temp2 = temp2.next;
            }

        }


        return mergedList;

    }
}
