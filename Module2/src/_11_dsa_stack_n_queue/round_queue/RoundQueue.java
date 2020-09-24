package _11_dsa_stack_n_queue.round_queue;

import _11_dsa_stack_n_queue.trien_khai_queue.Node;

public class RoundQueue<E> {
    public Node front;
    public Node rear;
    public int numNode;

    public RoundQueue() {
    }
    public void enQueue(E e) {
        Node temp = this.front;
        if (numNode == 0) {
            this.front = new Node(e);
            this.front.next = this.front;
            this.rear = this.front;
            numNode ++;
        } else if (numNode == 1) {
            this.front.next = this.rear = new Node(e);
            this.rear.next = this.front;
            numNode++;
        } else if (numNode >1) {
            for(int i = 0; i<numNode-1;i++) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNode++;
            this.rear = temp.next;
            this.rear.next = this.front;
        }

    }
    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = front.next;
        this.rear.next =  this.front;
        numNode--;
        return temp;
    }
    public void printList(){
        Node temp = front;
        for (int i = 0; i<numNode*2;i++) {
            System.out.println(temp.key);
            temp = temp.next;
        }
    }
}
