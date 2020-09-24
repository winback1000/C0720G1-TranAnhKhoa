package _11_dsa_stack_n_queue.queue_by_arrayList;

import java.util.ArrayList;

public class QueueArray<E> {
    private int capacity;
    private ArrayList<E> queueArr;
//    private int head;
//    private int tail;
    private int currentSize;

    public QueueArray() {
        queueArr = new ArrayList<>(10);
        capacity = 10;
    }

    public QueueArray(int capacity) {
        this.capacity = capacity;
        queueArr = new ArrayList<>(capacity);
    }

    public int getCapacity() {
        return capacity = queueArr.size();
    }

    public ArrayList<E> getQueueArr() {
        return queueArr;
    }

    public E getHead() {
        return queueArr.get(0);
    }

    public E getTail() {
        return queueArr.get(queueArr.size()-1);
    }

    public int getCurrentSize() {
        return currentSize;
    }


    public boolean isEmpty() {
        return currentSize <= 0;
    }
    public boolean isFull() {
        return (currentSize == capacity);
    }
    public void enQueue(E e){
        if(isFull()) {
            System.out.println("The queue is full, auto increase the size to double");
            queueArr.ensureCapacity(currentSize);
        }
        queueArr.add(e);
        currentSize++;
    }
    public void deQueue() {
        E temp = queueArr.get(0);
        queueArr.remove(0);
        currentSize--;
        System.out.println(temp);

    }
    public String toString() {
        if (isEmpty()) {
            return null;
        } else {
            return queueArr.toString();
        }
    }
}
