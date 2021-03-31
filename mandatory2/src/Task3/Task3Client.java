package Task3;

public class Task3Client {

    public static void main(String[] args) {

        StackQueue stackQueue = new StackQueue();

        System.out.println("-----TASK 3-----");

        // Push numbers from 1 to 20
        for (int i = 1; i < 21; i++) {
            stackQueue.push(i);
        }
        stackQueue.printList();

        stackQueue.stackPop();
        stackQueue.queuePop();
        stackQueue.stackPop();
        stackQueue.stackPop();
        stackQueue.queuePop();
        System.out.println("-----List after popping-----");
        stackQueue.printList();
    }
}