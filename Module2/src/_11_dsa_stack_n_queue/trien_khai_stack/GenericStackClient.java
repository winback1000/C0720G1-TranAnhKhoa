package _11_dsa_stack_n_queue.trien_khai_stack;

public class GenericStackClient{
    public static void main(String[] args) {
        System.out.println("Stack of String");
        stackOfString();
        System.out.println("Stack of integer");
        stackOfIntegers();
        int a;
        int b;
    }
    public static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println("size of stack before pushing" + stack.size());
        System.out.println("Pop elements from stack");
        while(!stack.isEmpty()) {
            System.out.printf("%s", stack.pop()+"\n");
        }
        System.out.println("size of stack after popping " + stack.size());
    }
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }




}
