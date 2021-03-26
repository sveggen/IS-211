package Task4;

class Element  {
    private String name;
    private int priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}


public class PriorityQueue {

    public Boolean addElement(Element e) {

        return false;
    }

    public Element getHighestPriorityElement(){

        return new Element();
    }

    public Boolean printAllElementsInOrder(){
        return false;
    }
}
