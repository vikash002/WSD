
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import static javax.swing.text.html.CSS.Attribute.FONT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash
 */
public class outputpanel extends javax.swing.JPanel {

    /**
     * Creates new form GUIOUTPUT
     */
    Image img;
    public outputpanel() {
        initComponents();
        Impwrd.setText(inputClass.main_words);
        System.out.println(" i am here main word " + inputClass.main_words);
        ImageIcon ic = new ImageIcon(getClass().getResource("5.jpg"));
       
        img = ic.getImage();
        
        Dimension d = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setSize(d);
        Resultwrd.setText("");
        Resultwrd.setText(Resultwrd.getText() + "\n" + "word number\tsense ID\tword ");
        Resultwrd.setText(Resultwrd.getText() + "\n" + "-----------------------------------------------------");
//        Resultwrd.setText(Resultwrd.getText() + "\n" + "----------------------------------------");
        for (int i = 0; i < GlobalClass.labels.size(); i++) {
            Resultwrd.setText(Resultwrd.getText() + "\n" + +GlobalClass.labels.get(i).wn + "\t" + GlobalClass.labels.get(i).n +"\t"+ GlobalClass.labels.get(i).m);
            //jTextArea3.setText(jTextArea3.getText() + "\n" + String.valueOf(stopIdx.get(i)));
          //  Resultwrd.setText(Resultwrd.getText() + "\n" + "---------------------------------------");
         
        }
        
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Impwrd = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Resultwrd = new javax.swing.JTextArea();
        proceed = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Lucida Bright", 0, 11)); // NOI18N
        setPreferredSize(new java.awt.Dimension(550, 420));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Important Words In The Context :");

        Impwrd.setEditable(false);
        Impwrd.setColumns(20);
        Impwrd.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        Impwrd.setLineWrap(true);
        Impwrd.setRows(5);
        jScrollPane1.setViewportView(Impwrd);

        Resultwrd.setEditable(false);
        Resultwrd.setColumns(20);
        Resultwrd.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        Resultwrd.setLineWrap(true);
        Resultwrd.setRows(5);
        jScrollPane2.setViewportView(Resultwrd);

        proceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pr.jpg"))); // NOI18N
        proceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceed))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proceed)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedMouseClicked
        // TODO add your handling code here:
        mainstart.mnpublic.card5 = new bestMatch();
        mainstart.mnpublic.tray.add(mainstart.mnpublic.card5, "card5");
        
        CardLayout card = (CardLayout) (mainstart.mnpublic.tray).getLayout();
        card.show(mainstart.mnpublic.tray,"card5");
        
    }//GEN-LAST:event_proceedMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Impwrd;
    private javax.swing.JTextArea Resultwrd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel proceed;
    // End of variables declaration//GEN-END:variables
}