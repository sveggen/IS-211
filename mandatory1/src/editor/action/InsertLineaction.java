/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor.action;

import editor.Document;
import editor.Editor;
import java.awt.event.ActionEvent;

/**
 * This action breaks a line. It is bound to the enter key
 *
 * @author evenal
 */
public class InsertLineaction extends EditorAction {

    public InsertLineaction(String name, Editor ed) {
        super(name, ed);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Document doc = editor.getDocument();
        doc.insertLine();
        doc.print();
    }
}
