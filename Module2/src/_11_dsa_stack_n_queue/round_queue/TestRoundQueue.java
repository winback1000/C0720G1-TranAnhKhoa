package _11_dsa_stack_n_queue.round_queue;

public class TestRoundQueue {
    public static void main(String[] args) {
        RoundQueue roundQueue = new RoundQueue();
        roundQueue.enQueue(1);
        roundQueue.enQueue(2);
        roundQueue.enQueue(3);
        roundQueue.enQueue(4);
        System.out.println(roundQueue.deQueue());
        System.out.println();
        roundQueue.printList();
    }
}
