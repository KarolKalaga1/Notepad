
package group.option;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author Karol
 */
public class TextOption {
      private String allText;
    
    public String findWord(String text){
        return text;
    }
    
    public String findLine(String text){
        return text;
    }
    public void copyText(JTextPane jTextEditor){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String text = jTextEditor.getSelectedText();
        if(text == null)
            text =jTextEditor.getText();
        StringSelection selection = new StringSelection(text);
        clipboard.setContents(selection, null);
    }
    public String pasteText(JTextPane jTextEditor){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        DataFlavor flavor= DataFlavor.stringFlavor;
        
        if(clipboard.isDataFlavorAvailable(flavor)){
            try {
                String text= (String) clipboard.getData(flavor);
                jTextEditor.replaceSelection(text);
            } catch (UnsupportedFlavorException ex) {
                JOptionPane.showMessageDialog(jTextEditor, "Blad Wklejania "+ex.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(jTextEditor, "Blad Wklejania "+ex.getMessage());
            }
        }
    return "";
    }
    public String checkWord(JTextPane jTextEditor){
        
//        jTextEditor.getText().
     return "";   
    }
    
}
