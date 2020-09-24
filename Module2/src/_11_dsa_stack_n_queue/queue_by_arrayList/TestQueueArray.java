package _11_dsa_stack_n_queue.queue_by_arrayList;

public class TestQueueArray {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(4);
        queue.enQueue(4);
        System.out.println(queue);
        queue.deQueue();
        System.out.println(queue);
        queue.enQueue(56);
        queue.enQueue(2);
        queue.enQueue(67);
        System.out.println(queue);
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue);
        queue.enQueue(24);
        System.out.println(queue);
        queue.deQueue();
        System.out.println(queue);
        queue.enQueue(98);
        queue.enQueue(45);
        queue.enQueue(23);
        queue.enQueue(435);
        System.out.println(queue);
        System.out.println(queue.getCapacity());
    }
}
