package Task3;

public class StackQueue {

    private Node first;
    private Node last;
    private int curr;

    private boolean isEmpty() {
        return curr == 0;
    }

    public Number stackPop() {
        if (isEmpty())
            return null;
        int oldLast = last.number;
        last = last.prev;
        last.next = null;
        curr--;

        return oldLast;
    }

    // dequeue
    public int queuePop() {
        int firstNumber = first.number;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        curr--;

        return firstNumber;
    }

    // enqueue / push
    public void push(int num) {
        Node oldLast = last;
        last = new Node();
        last.number = num;
        last.next = null;

        if (isEmpty()) {
            first = last;
            last.prev = null;
        } else {
            last.prev = oldLast;
            oldLast.next = last;
        }
        curr++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        Node temp = first;

        System.out.println("-----Front of queue / bottom of stack-----");
        while (temp != null) {
            System.out.println(temp.number);
            temp = temp.next;
        }
        System.out.println("-----Rear of queue / top of stack-----");
    }
}
