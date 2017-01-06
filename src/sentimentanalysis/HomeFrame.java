/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sentimentanalysis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author TOSHIBA
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
      
      
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      setBounds(0,0,screenSize.width, screenSize.height);
//      getContentPane().add(new JLabel("sentance"), BorderLayout.NORTH);
       
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        but_domain = new javax.swing.JButton();
        butdic = new javax.swing.JButton();
        butsentsum = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        butpolrity = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(getMaximumSize());

        but_domain.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        but_domain.setText("Domain registartion");
        but_domain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_domainActionPerformed(evt);
            }
        });

        butdic.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        butdic.setText("Dictionary Generation");
        butdic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdicActionPerformed(evt);
            }
        });

        butsentsum.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        butsentsum.setText("Sentance sum");
        butsentsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsentsumActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        butpolrity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        butpolrity.setText("Polarity");
        butpolrity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butpolrityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but_domain, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butdic, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butsentsum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butpolrity, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butsentsum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butdic, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butpolrity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but_domain, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_domainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_domainActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
         
          jDesktopPane1.revalidate();
            jDesktopPane1.repaint();
         HomeFrame.this.revalidate();
          HomeFrame.this.pack();
//           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      setBounds(0,0,screenSize.width, screenSize.height);
//      getContentPane().add(new JLabel("sentance"), BorderLayout.NORTH);
        domainJFrame df=new domainJFrame();
        
        df.setVisible(true);
        
        jDesktopPane1.add(df);
        
    }//GEN-LAST:event_but_domainActionPerformed

    private void butdicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdicActionPerformed
        // TODO add your handling code here:
             jDesktopPane1.removeAll();
         jDesktopPane1.revalidate();
           jDesktopPane1.repaint();
         HomeFrame.this.revalidate();
          HomeFrame.this.pack();
//           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      setBounds(0,0,screenSize.width, screenSize.height);
//      getContentPane().add(new JLabel("sentance"), BorderLayout.NORTH);
        SentimentJFrame df=new SentimentJFrame();
        
        df.setVisible(true);
        
        jDesktopPane1.add(df);
    }//GEN-LAST:event_butdicActionPerformed

    private void butsentsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsentsumActionPerformed
        // TODO add your handling code here:
         jDesktopPane1.removeAll();
         jDesktopPane1.revalidate();
         jDesktopPane1.repaint();
        HomeFrame.this.revalidate();
          HomeFrame.this.pack();
//           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      setBounds(0,0,screenSize.width, screenSize.height);
//      getContentPane().add(new JLabel("sentance"), BorderLayout.NORTH);
        sentanceSum df=new sentanceSum();
        
        df.setVisible(true);
        
        jDesktopPane1.add(df);
        
        
    }//GEN-LAST:event_butsentsumActionPerformed

    private void butpolrityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butpolrityActionPerformed
        // TODO add your handling code here:
          jDesktopPane1.removeAll();
         jDesktopPane1.revalidate();
         jDesktopPane1.repaint();
        HomeFrame.this.revalidate();
          HomeFrame.this.pack();
//           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      setBounds(0,0,screenSize.width, screenSize.height);
//      getContentPane().add(new JLabel("sentance"), BorderLayout.NORTH);
        Polarity df=new Polarity();
        
        df.setVisible(true);
        
        jDesktopPane1.add(df);
    }//GEN-LAST:event_butpolrityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_domain;
    private javax.swing.JButton butdic;
    private javax.swing.JButton butpolrity;
    private javax.swing.JButton butsentsum;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}