package Task3;

public class Client {

    public static void main(String[] args) {

        StackQueue stackQueue = new StackQueue();

        // Push numbers from 1 to 20
        for (int i = 1; i < 21; i++) {
            stackQueue.push(i);
        }
        stackQueue.stackPop();
        stackQueue.queuePop();
        stackQueue.stackPop();
        stackQueue.stackPop();
        stackQueue.queuePop();
        stackQueue.printList();
    }
}
