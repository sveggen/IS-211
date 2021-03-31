package Task4;


public class PriorityQueue<Element extends Comparable> {

    private final Element[] heap;
    private int curr;

    public PriorityQueue(int maxSize) {
        //this.heap = new Element[maxSize+1];
        heap = (Element[]) (new Comparable[maxSize+1]);
        curr = 0;
    }
    private boolean less(int v, int w){
        return (heap[v]).compareTo(heap[w]) > 0 ;
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

    private void swap(int posA, int posB){
        Element temp = heap[posA];
        heap[posA] = heap[posB];
        heap[posB] = temp;
    }


    // good
    private void swimUpStream(int pos){

        while((pos > 1) && less(parent(pos), pos)){
            swap(parent(pos), pos);
            pos = parent(pos);
        }
    }



    // good
    private void sinkDownStream(int pos){

        while (leftChild(pos) <= curr) {

            int lc = leftChild(pos);

            // the greater child gets upped to parent
            if ((lc < curr) && less(lc, rightChild(pos))){
                lc++;
            }
            // if leftchild is larger than pos - break
            if (less(lc, pos)) {
                break;
            }
            swap(pos, lc);
            pos = lc;
        }
    }




    //good
    public void insertElement(Element e){
        heap[curr+1] = e;
        curr++;
        swimUpStream(curr);
    }


    // good
    public Element removeMaxElement(){
        Element max = heap[1];
        heap[1] = heap[curr];
        heap[curr] = null;
        curr--;
        sinkDownStream(1);
        return max;
    }

    public Element getHighestPriorityElement(){
        return heap[1];
    }


    public Element[] returnAllElementsInOrder(){
        int oldCurr = curr;
        Element[] oldHeap = heap;
        //Element[] tempHeap = (Element[]) (new Comparable[curr+1]);
        for (int i = 1; i <= curr; i++){
            Element maxElement = removeMaxElement();
            oldHeap[i++] = maxElement;
        };
        return oldHeap;
    }
}
