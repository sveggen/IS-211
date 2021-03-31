package Task4;

public class Task4Client {

    public static void main(String[] args){
        PriorityQueue<Element> pq = new PriorityQueue<>(9);
        Element t = new Element();

        t.priority = 5;
        t.name = "Terje";

        Element k = new Element();
        k.priority = 7;
        k.name = "Kari";

        Element n = new Element();
        n.priority = 4;
        n.name = "Nils";

        Element ot = new Element();
        ot.priority = 8;
        ot.name = "Otto";

        Element s = new Element();
        s.priority = 7;
        s.name = "Syvert";

        Element l = new Element();
        l.priority = 11;
        l.name = "Lise";

        Element no = new Element();
        no.priority = 0;
        no.name = "Notto";

        Element od = new Element();
        od.priority = 1;
        od.name = "Odd";

        Element e = new Element();
        e.priority = 2;
        e.name = "Even";


        System.out.println("-----TASK 4 -----");
        pq.insertElement(t);
        pq.insertElement(k);
        pq.insertElement(n);
        pq.insertElement(ot);
        pq.insertElement(s);
        pq.insertElement(l);
        pq.insertElement(no);
        pq.insertElement(od);
        pq.insertElement(e);


        Element max = pq.getHighestPriorityElement();
        System.out.println("Priority: " + max.priority + " | Name: " + max.name);


         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
         System.out.println(pq.removeMaxElement().priority);
    }
}
