package Task3;

import java.util.ArrayList;

public class StackQueue {

    public static void main(String[] args) {

        StackQueue stackQueue = new StackQueue();

        // Push elements to Task3.StackQueue
        for (int i = 0; i < 20; i++) {
            stackQueue.push(i);
        }
        // Pop elements from Task3.StackQueue
        stackQueue.stackPop();
        stackQueue.queuePop();
        stackQueue.stackPop();
        stackQueue.stackPop();
        stackQueue.queuePop();
        stackQueue.printStackQueue();
    }


    ArrayList<Integer> elements;
    private static int top;

    public StackQueue() {
        elements = new ArrayList<>();
        top = -1;
    }


    public void stackPop() {

    }

    public void queuePop() {

    }

    public void push(int i) {
        System.out.println("Pushing " + i);
        elements.add(++top, i);
    }

    public void printStackQueue() {
        for (int e : elements) {
            System.out.println(e);
        }
    }
}
