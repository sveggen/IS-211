package Task4;

public class Client {

    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue(25);
        Element el = new Element();
        el.priority = 5;
        el.name = "Hei";

        Element ol = new Element();
        ol.priority = 76;
        ol.name = "asdas";

        Element dfg = new Element();
        ol.priority = 123;
        ol.name = "dsa3";


        pq.insertElement(el);
        pq.insertElement(ol);
        pq.insertElement(dfg);

    }
}
