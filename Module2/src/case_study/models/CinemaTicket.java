package case_study.models;

import java.util.ArrayDeque;
import java.util.Queue;

public class CinemaTicket {
    public static int ticket = 1;
    public static Queue<Customer> queue = new ArrayDeque<>();

    public static void bookTicket(Customer customer) {
        queue.add(customer);
    }
    public static void printTicket() {
        if (queue.size()<=0) {
            System.out.println("There is no customer books for ticket yet");
        } else {
            while (queue.size()>0) {
                System.out.println("Ticket: " + ticket + " Customer name: " + queue.poll().getName());
                ticket++;
            }
        }
    }
}
