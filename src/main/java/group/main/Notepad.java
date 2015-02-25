
package group.main;

import group.option.FileOption;
import group.option.TextOption;
import java.awt.Font;
import javax.swing.ImageIcon;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.TwilightSkin;
import say.swing.JFontChooser;

/**
 * @author Karol
 */

public class Notepad extends javax.swing.JFrame {

    private String fileName;
    private final FileOption fileControler;
    private TextOption fileOption;
    
    public Notepad() { 
     
        this.fileControler = new FileOption();
        skin();
        initComponents();
        initialize(); 
        
    }
    
    public final void skin(){
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        SubstanceLookAndFeel.setSkin(new TwilightSkin());
        SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.TwilightSkin");
    }
    
    public final void initialize(){
        jCheckHtml.setSelected(false);
        jMenuSave.setEnabled(false);
        setSize(600, 400);
        setLocation(600, 200);
        setTitle("Notepad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextEditor = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenuItem();
        jMenuOpen = new javax.swing.JMenuItem();
        jMenuSave = new javax.swing.JMenuItem();
        jMenuSaveAs = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuPrint = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuFindWord = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuCut = new javax.swing.JMenuItem();
        jMenuCopy = new javax.swing.JMenuItem();
        jMenuPaste = new javax.swing.JMenuItem();
        jMenuDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuFonts = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jCheckHtml = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem12.setText("jMenuItem12");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextEditor.setContentType("text"); // NOI18N
        jScrollPane1.setViewportView(jTextEditor);

        jMenu1.setText("File");

        jMenuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNew.setText("New");
        jMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNew);

        jMenuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuOpen.setText("Open..");
        jMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuOpen);

        jMenuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSave.setText("Save");
        jMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSave);

        jMenuSaveAs.setText("Save as..");
        jMenuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSaveAs);
        jMenu1.add(jSeparator2);

        jMenuPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuPrint.setText("Print");
        jMenuPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrintActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPrint);
        jMenu1.add(jSeparator1);

        jMenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");

        jMenuFindWord.setText("Find word..");
        jMenuFindWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFindWordActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuFindWord);
        jMenu3.add(jSeparator5);

        jMenuCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCut.setText("Cut");
        jMenuCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCutActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCut);

        jMenuCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCopy.setText("Copy");
        jMenuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCopyActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCopy);

        jMenuPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuPaste.setText("Paste");
        jMenuPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPasteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuPaste);

        jMenuDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuDelete.setText("Delete");
        jMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuDelete);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Format");

        jMenuFonts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFonts.setText("Fonts");
        jMenuFonts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFontsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuFonts);
        jMenu2.add(jSeparator4);

        jCheckHtml.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jCheckHtml.setSelected(true);
        jCheckHtml.setText("text/html");
        jCheckHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckHtmlActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckHtml);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Help");

        jMenuHelp.setText("Help");
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuHelp);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformed
       fileControler.newDocument(jTextEditor);
    }//GEN-LAST:event_jMenuNewActionPerformed

    private void jMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenActionPerformed
     fileControler.openDocument(jTextEditor, rootPane);     
     jMenuSave.setEnabled(true);
    }//GEN-LAST:event_jMenuOpenActionPerformed

    private void jMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveActionPerformed
        fileControler.saveDocument(jTextEditor, rootPane);
    }//GEN-LAST:event_jMenuSaveActionPerformed

    private void jMenuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveAsActionPerformed
      fileControler.saveAsDocument(jTextEditor, rootPane);
    }//GEN-LAST:event_jMenuSaveAsActionPerformed

    private void jCheckHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckHtmlActionPerformed
           if(!jCheckHtml.isSelected()){
               String text=jTextEditor.getText();
               jTextEditor.setContentType("text/html");
               jTextEditor.setText(text);
           }
             if(jCheckHtml.isSelected()){
               String text=jTextEditor.getText();
               jTextEditor.setContentType("text");
               jTextEditor.setText(text);
           }
    }//GEN-LAST:event_jCheckHtmlActionPerformed

    private void jMenuPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrintActionPerformed
        fileControler.printDocument(jTextEditor);
    }//GEN-LAST:event_jMenuPrintActionPerformed

    private void jMenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteActionPerformed
        jTextEditor.getSelectedText();
        jTextEditor.setText(jTextEditor.getText().replace(jTextEditor.getSelectedText(), ""));
      
    }//GEN-LAST:event_jMenuDeleteActionPerformed

    private void jMenuCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCopyActionPerformed
     fileOption.copyText(jTextEditor);
    }//GEN-LAST:event_jMenuCopyActionPerformed

    private void jMenuCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCutActionPerformed
      

    }//GEN-LAST:event_jMenuCutActionPerformed

    private void jMenuPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPasteActionPerformed
        fileOption.pasteText(jTextEditor);
    }//GEN-LAST:event_jMenuPasteActionPerformed

    private void jMenuFontsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFontsActionPerformed
         JFontChooser jFontChooser = new JFontChooser();
 // show font chooser dialog and get the result
        int result = jFontChooser.showDialog(this);
        // retrieve selected font
        Font selectedFont = null;
        if (result == APPROVE_OPTION)
     selectedFont = jFontChooser.getSelectedFont();
        jTextEditor.setFont(selectedFont);
    }//GEN-LAST:event_jMenuFontsActionPerformed

    private void jMenuFindWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFindWordActionPerformed
     ChooseWord frameChooseWord=new ChooseWord(jTextEditor);
     frameChooseWord.show(true);
    }//GEN-LAST:event_jMenuFindWordActionPerformed

    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/about.png"));
        JOptionPane.showMessageDialog(null, "\n"
                + "Program created by Karol Kalaga.\nFor more information please write at kalaga@students.zcu.cz", "About", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_jMenuHelpActionPerformed
    
//    Zaznaczenie fragmentu w tekscie

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckHtml;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCopy;
    private javax.swing.JMenuItem jMenuCut;
    private javax.swing.JMenuItem jMenuDelete;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenuItem jMenuFindWord;
    private javax.swing.JMenuItem jMenuFonts;
    private javax.swing.JMenuItem jMenuHelp;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuNew;
    private javax.swing.JMenuItem jMenuOpen;
    private javax.swing.JMenuItem jMenuPaste;
    private javax.swing.JMenuItem jMenuPrint;
    private javax.swing.JMenuItem jMenuSave;
    private javax.swing.JMenuItem jMenuSaveAs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextPane jTextEditor;
    // End of variables declaration//GEN-END:variables
}
