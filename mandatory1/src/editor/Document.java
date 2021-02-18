
package editor;

import java.util.LinkedList;
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
    // DoublyLinkedList dll = new DoublyLinkedList();

    /** Document data structure(s) */
    // pointer to the
    CharacterDisplay display;
    private int cursorRow;
    private int cursorCol;

    // Max allowed chars in a column (39)
    private int maxCursorCols = CharacterDisplay.WIDTH - 1;
    // Max allowed rows (19)
    private int maxCursorRows = CharacterDisplay.HEIGHT - 1;
    // CusorColumnList
    LinkedList<Character> cCL = new LinkedList<>();
    // CusorRowList
    LinkedList<Character> cRL = new LinkedList<>();

    public Document(CharacterDisplay display) {
        // set up data structure

        this.display = display;
        cursorCol = cursorRow = 0;

        int i = 0;
        int j = 0;

        while (i <= display.getWidth()) {
            cCL.add(' ');
            i++;
        }

        int lines = 800;

        while (j <= lines) {
            cRL.add(' ');
            j++;
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
        // updateDisplay();
    }

    public void shiftChars() {
        int cIndex = cursorCol;
        int rIndex = cursorRow;

        while (cIndex < cCL.size() - 1) {
            Character val = cCL.get(cIndex + 1);
            cCL.add(cIndex + 2, val);
            cCL.removeLast();

            cIndex++;
        }

        while (rIndex < cRL.size() - 1) {
            Character val = cRL.get(rIndex + 1);
            cRL.add(rIndex + 2, val);
            cRL.removeLast();

            rIndex++;
        }
    }

    public void insert(Character c) {
        // insert the character c into the data structure
        display.displayChar(c, cursorRow, cursorCol);
        display.displayCursor(' ', cursorRow, cursorCol);

        if (cursorCol > this.maxCursorCols) {
            cursorCol = 0;
            cursorRow++;
        } else if (cursorCol == this.maxCursorCols && cursorRow == this.maxCursorRows) {
            return;
        } else {
            cursorCol++;
        }

    }

    public void shiftChar(char c) {
        cCL.add(cursorCol, c);
        cRL.add(cursorRow, c);

        display.displayChar(c, cursorRow, cursorCol);

        if (cursorRow < this.maxCursorRows) {
            int a = CharacterDisplay.WIDTH - cursorCol;
            System.out.println(a);
            for (int i = 0; i < a; i++) {
                cCL.add('c');
            }
            System.out.println(cCL.size());
            cursorCol = 0;
            cursorRow++;
        }
        display.displayCursor(' ', cursorRow, cursorCol);

    }

    public void deleteChar(char c) {
        cRL.add(cursorRow, ' ');
        cCL.add(cursorCol, ' ');

        display.displayChar(' ', cursorRow, cursorCol);

        if (cursorCol == 0 && cursorRow == 0) {

        } else if (cursorCol == 0 && cursorRow >= 0) {
            cursorCol = 39;
            cursorRow--;
        } else {
            cursorCol--;
        }
        display.displayCursor(' ', cursorRow, cursorCol);
    }

    public char deleteNext() {

        return ' ';
    }

    public void moveCursor(String direction) {
        switch (direction) {
            case "LEFT":

                break;
            case "RIGHT":

                break;
        }

    }

    public void print() {
    }
}
