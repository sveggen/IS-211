package editor;

public class DoublyLinkedList {

  class Node {
    char character;
    Node previous;
    Node next;

    public Node(char character) {
      this.character = character;
    }
  }

  private int size;

  Node head, tail = null;

  public void add(char character) {
    Node newNode = new Node(character);

    if (head == null) {
      head = tail = newNode;
      head.previous = null;

      tail.next = null;
    } else {

      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
      tail.next = null;
    }
  }

  public void removeNode(Node rem) {
    // Vanlig
    if (head == null || rem == null) {
      return;
    }
    // Endre til neste dersom hoved noden blir slettet
    if (head == rem) {
      head = rem.next;
    }
    // Endre til forrige dersom hoved noden blir slettet
    if (rem.next != null) {
      rem.next.previous = rem.previous;
    }
    // Endre til forrige hvis noden som skal slettes ikke er den første noden
    if (rem.previous != null) {
      rem.previous.next = rem.next;
    }

    return;

  }

  public void printNodes() {
    Node temp = head;

    if (head == null) {
      System.out.println("empty");
      return;
    }
    // System.out.println(temp.toString());
    while (temp != null) {
      // System.out.println(head.character + "Press next");
      System.out.printf("%c", temp.character);
      temp = temp.next;
    }

  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void addBefore(char character) {

  }

  public void addAfter(char character) {

  }

}
