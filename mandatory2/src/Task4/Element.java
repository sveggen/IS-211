package Task4;

public class Element implements Comparable<Element> {

    String name;

    int priority;

    @Override
    public int compareTo(Element o) {
        if (priority < o.priority) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
