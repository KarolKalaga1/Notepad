
package group.main;

import java.awt.Component;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author Karol
 */
public class FileOption {
    
     private String fileName;
     
     public void newDocument(JTextPane jTextEditor){
        jTextEditor.setText(null);
    }
    
     public void openDocument(JTextPane jTextEditor, Component rootPane){
          try {
            JFileChooser fileChooser = new JFileChooser();
            int showOpenDialog = fileChooser.showOpenDialog(rootPane);

            BufferedReader File;
            File name=fileChooser.getSelectedFile();
            fileName = name.getPath();
            File = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            
            Scanner in;
            in = new Scanner(File);
            
            String full = "";
            while(in.hasNext())
            {
                String tekst = in.nextLine();
                full += tekst;
                full+="\n";                
            }
            in.close();
            File.close();
            jTextEditor.setText(full);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Bład pobierania danych "+ex.getMessage());
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(rootPane, "Bład zamykania "+ex.getMessage());
        }
     }
     
     public void saveDocument(JTextPane jTextEditor,Component rootPane){
          try {
            FileWriter plikWy=null;
            
            plikWy = new FileWriter(fileName);
           
            plikWy.write(jTextEditor.getText());
            plikWy.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Bład zapisu do pliku "+ex.getMessage());
        }
     }
     
     public void saveAsDocument(JTextPane jTextEditor,Component rootPane){
       String selectedFile=null;
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(rootPane);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile().toString();    
        }               
        
        try {
            FileWriter plikWy;        
            plikWy = new FileWriter(selectedFile);          
            plikWy.write(jTextEditor.getText());
            plikWy.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Bład zapisu do pliku "+ex.getMessage());
        }
     }
     
     public void printDocument(JTextPane jTextEditor){
         try {
            boolean compile = jTextEditor.print();
            
            if(compile){
            JOptionPane.showMessageDialog(null, "Done printing");
            }
            
         } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Bład drukowania "+ex.getMessage());
         }
     }
}
