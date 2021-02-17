
package editor;

import editor.display.CharacterDisplay;

/**
 * This class represents the document being edited. Using a 2d array to hold the
 * document content is probably not a very good choice. Fixing this class is the
 * main focus of the exercise. In addition to designing a better data model, you
 * must add methods to do at least basic editing: write and delete text, and
 * moving the cursor
 *
 * Implement the following commands
 *
 * @author evenal
 */

public class Document {
    DoublyLinkedList dll = new DoublyLinkedList();

    /** Document data structure(s) */
    // pointer to the
    CharacterDisplay display;

    public Document(CharacterDisplay display) {
        // set up data structure

        this.display = display;

        int i = 0;

        while (i <= display.getWidth()) {
            dll.add(' ');
            i++;
        }
    }

    // private void updateDisplay() {
    // // should be called at the end of the functionality
    // // and should update the display

    // dll.printNodes();
    // }

    /*
     * The following methods are called from the actions. Decide on the data
     * structure(s) for Document first. Then finish these methods
     */
    public void insertLine() {
        // create a new line in the data structure
        updateDisplay();
    }

    public void insert(Character c) {
        // insert the character c into the data structure

        dll.add(c);

        updateDisplay();
    }

    public char deleteNext() {

        return ' ';
    }

    public char deletePrev() {
        return ' ';
    }

    public void moveCursor(String direction) {

    }

    private void updateDisplay() {
        // for all visible characterso
        // show them in the rightplace
        int line = 5;
        int column = 0;
        char c = 0;
        display.displayChar('d', 2, column);

        // and make the cursor stand out a little
        display.displayCursor(c, line, column);

        // print nodes
        dll.printNodes();
    }

    public void print() {
    }
}
