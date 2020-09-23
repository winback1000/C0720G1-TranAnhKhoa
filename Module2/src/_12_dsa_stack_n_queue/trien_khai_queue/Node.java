package _12_dsa_stack_n_queue.trien_khai_queue;

public class Node<E> {
    public E key;
    public Node next;

    public Node(E key) {
        this.key = key;
        this.next = null;
    }

    public String toString() {

        return ""+key;
    }

}
