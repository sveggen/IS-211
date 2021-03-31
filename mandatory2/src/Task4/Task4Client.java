package Task4;

public class Task4Client {

    public static void main(String[] args) {

        PriorityQueue<Element> pq = new PriorityQueue<>(9);

        System.out.println("-----TASK 4 -----");
        System.out.println("-----Add elements -----");

        pq.addElement(new Element() {{
            priority = 5;
            name = "Terje";
        }});
        pq.addElement(new Element() {{
            priority = 7;
            name = "Kari";
        }});
        pq.addElement(new Element() {{
            priority = 4;
            name = "Nils";
        }});
        pq.addElement(new Element() {{
            priority = 8;
            name = "Otto";
        }});
        pq.addElement(new Element() {{
            priority = 7;
            name = "Syvert";
        }});
        pq.addElement(new Element() {{
            priority = 11;
            name = "Lise";
        }});
        pq.addElement(new Element() {{
            priority = 0;
            name = "Notto";
        }});
        pq.addElement(new Element() {{
            priority = 1;
            name = "Odd";
        }});
        pq.addElement(new Element() {{
            priority = 2;
            name = "Even";
        }});

        System.out.println("-----Highest priority -----");
        Element max = pq.getHighestPriorityElement();
        System.out.println("Priority: " + max.priority + " | Name: " + max.name);

        System.out.println("-----All elements in order -----");
        for (Element element : pq.returnAllElementsInOrder()) {
            System.out.println("Priority: " + element.priority + " | Name: " + element.name);
        }
    }
}