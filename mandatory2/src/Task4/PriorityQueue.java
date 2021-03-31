package Task4;


public class PriorityQueue {

    private final Element[] heap;
    private int curr;

    public PriorityQueue(int maxSize) {
        this.heap = new Element[maxSize+1];
        this.curr = 0;
    }

    public boolean isEmpty(){
        return curr == 0;
    }

    public int size(){
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

    private boolean isLeaf(int pos) {
        return pos >= (curr / 2) && pos <= curr;
    }

    private void swap(int posA, int posB){
        Element temp = heap[posA];
        heap[posA] = heap[posB];
        heap[posB] = temp;
    }

    private void swimUpStream(Element e){
        int pos = e.priority;

        while((pos > 1) && (pos < parent(pos))){
            swap(parent(pos), pos);
            pos = parent(pos);
        }
    }

    private void sinkDownStream(int pos){
        while (leftChild(pos) <= curr) {
            int el = leftChild(pos);
            if (leftChild(pos) < curr && leftChild(pos) < rightChild(pos)){
                el++;
            }
            if (pos > leftChild(pos)) {
                swap(pos, el);
                pos = el;
            }
        }
    }

    public void insertElement(Element e){
        System.out.println("Insert: " + e.name + " Priority: " + e.priority);
        heap[++curr] = e;
        curr++;
        swimUpStream(e);
    }

    public Element removeMaxElement(Element e){
        Element max = heap[1];
        swap(1, curr--);
        heap[curr+1] = null;
        sinkDownStream(1);
        System.out.println("Max: " + max.name + " Priority: " + max.priority);
        return max;
    }
}
