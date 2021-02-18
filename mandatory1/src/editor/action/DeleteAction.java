package editor.action;

import java.awt.event.ActionEvent;

import javax.swing.event.DocumentEvent;

import editor.Document;
import editor.Editor;

public class DeleteAction extends EditorAction {
  public DeleteAction(String name, Editor editor) {
    super(name, editor);
    // TODO Auto-generated constructor stub
  }

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  Editor editor;

  @Override
  public void actionPerformed(ActionEvent ae) {
    // TODO Auto-generated method stub
    Document doc = editor.getDocument();
    char ch = ae.getActionCommand().charAt(0);
    doc.deleteChar(ch);
  }

}
