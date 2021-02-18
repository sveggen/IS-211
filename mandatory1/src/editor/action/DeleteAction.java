package editor.action;

import java.awt.event.ActionEvent;

import javax.swing.event.DocumentEvent;

import editor.Document;
import editor.Editor;

public class DeleteAction extends EditorAction {
  public DeleteAction(String name, Editor editor) {
    super(name, editor);
    this.editor = editor;
  }


  @Override
  public void actionPerformed(ActionEvent ae) {
    Document doc = editor.getDocument();
    char ch = ae.getActionCommand().charAt(0);
    doc.deleteChar(ch);
  }

}
