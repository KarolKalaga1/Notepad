
package group.main;

import group.MyHighlightPainter;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Karol
 */
public class ChooseWord extends javax.swing.JFrame {
    JTextComponent jTextEditor;
     Highlighter.HighlightPainter myHigh = new MyHighlightPainter(Color.red);
    public ChooseWord(JTextComponent jTextEditor) {
        this.jTextEditor=jTextEditor;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFindWord = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Find words : ");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFindWord, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSearch)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFindWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
       String word=jTextFindWord.getText();
       hight(jTextEditor, word);
       dispose();
    }//GEN-LAST:event_jButtonSearchActionPerformed
  public void hight (JTextComponent textComp,String pattern){
      removeHigh(textComp);
      
      if(!pattern.equals("")){
        try {
            Highlighter hilite =textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            int pos = 0;
            
            while((pos=text.toUpperCase().indexOf(pattern.toUpperCase(),pos))>=0){
                hilite.addHighlight(pos, pos+pattern.length(), myHigh);
                pos+=pattern.length();
            }
        } catch (BadLocationException ex) {
            JOptionPane.showMessageDialog(textComp,"Bøad zaznaczania");
        }
      }
    }
  
  public void removeHigh(JTextComponent textComp){
      Highlighter hilite = textComp.getHighlighter();
      Highlighter.Highlight[] hilites = hilite.getHighlights();
      
      for(int i=0 ; i<hilites.length; i++){
          if(hilites[i].getPainter() instanceof  MyHighlightPainter){
              hilite.removeHighlight(hilites[i]);
          }
      }
  }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFindWord;
    // End of variables declaration//GEN-END:variables
}
