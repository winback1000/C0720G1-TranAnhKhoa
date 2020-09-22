package _12_dsa_stack_n_queue.trien_khai_queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = this.tail = null;
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if(this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
            this.tail.next = null;
            this.tail = temp;
    }
    public Node dequeue() {
        if(this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
