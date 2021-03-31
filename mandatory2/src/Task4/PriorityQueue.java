package Task4;


import java.util.ArrayList;

public class PriorityQueue<Element extends Comparable> {

    private Element[] heap;
    private int curr;

    public PriorityQueue(int maxSize) {
        heap = (Element[]) (new Comparable[maxSize + 1]);
        curr = 0;
    }

    private boolean less(int v, int w) {
        return (heap[v]).compareTo(heap[w]) > 0;
    }

    public int size() {
        return curr;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private void swap(int posA, int posB) {
        Element temp = heap[posA];
        heap[posA] = heap[posB];
        heap[posB] = temp;
    }

    private void swimUpStream(int pos) {

        while ((pos > 1) && less(parent(pos), pos)) {
            swap(parent(pos), pos);
            pos = parent(pos);
        }
    }

    private void sinkDownStream(int pos) {

        while (leftChild(pos) <= curr) {
            int lc = leftChild(pos);

            // switches places with the largest child
            if ((lc < curr) && less(lc, rightChild(pos))) {
                lc++;
            }
            if (less(lc, pos)) {
                break;
            }
            swap(pos, lc);
            pos = lc;
        }
    }

    public boolean addElement(Element e) {
        try {
            heap[curr + 1] = e;
            curr++;
            swimUpStream(curr);
        } catch (Exception t) {
            System.out.println("Element was NOT added");
            return false;
        }
        System.out.println("Element was added");
        return true;
    }

    public Element removeMaxElement() {
        Element max = heap[1];
        heap[1] = heap[curr];
        heap[curr] = null;
        curr--;
        sinkDownStream(1);
        return max;
    }

    public Element getHighestPriorityElement() {
        return heap[1];
    }

    public ArrayList<Element> returnAllElementsInOrder() {
        // creates a copy of current heap and curr field
        int oldCurr = curr;
        Element[] oldHeap = heap;

        ArrayList<Element> elements = new ArrayList<>();
        for (int i = 1; i <= oldCurr; i++) {
            Element maxElement = removeMaxElement();
            elements.add(maxElement);
        }
        // reassigns initial values
        heap = oldHeap;
        curr = oldCurr;

        return elements;
    }
}
