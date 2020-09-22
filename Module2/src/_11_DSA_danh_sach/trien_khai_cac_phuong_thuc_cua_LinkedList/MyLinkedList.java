package _11_DSA_danh_sach.trien_khai_cac_phuong_thuc_cua_LinkedList;

public class MyLinkedList<E> {
    Node head;
    int numNodes;

    public MyLinkedList(E e) {
        this.head = new Node(e);
    }

    class Node {
        Node next;
        E data;

        public Node(E e) {
            this.data = e;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        this.numNodes++;
    }
    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        this.numNodes++;
    }
    public void addLast(E e) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        this.numNodes++;
    }
    public Node remove(int index) {
        Node temp = head;
        Node deleted;
        for(int i=0; i < index-1 && temp.next.next != null; i++) {
            temp = temp.next;
        }
        deleted = temp.next;
        temp.next = temp.next.next;
        this.numNodes--;
        return deleted;
    }
    public MyLinkedList clone() {
        return this;
    }
    public boolean contains(E e) {
        boolean check =  false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == e) {
                check = true;
                break;
            }
            temp = temp.next;
        }
        return check;
    }
    public int indexOf(E e) {
        Node temp = head;
        for(int i = 0; i< numNodes; i++) {
            if( temp.data == e) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public void ensureCapa(int minCapacity) {
        while (this.numNodes < minCapacity) {
            this.numNodes *= 2;
        }
    }

    public int size() {
        return this.numNodes;
    }
    public E get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public E getFirst() {
        return head.data;
    }
    public E getLast() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void clear() {
        this.head = null;
        this.numNodes = 0;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
