/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hurufHijaiyah;

/**
 *
 * @author desktop
 */
public class formRegister extends javax.swing.JFrame {

    /**
     * Creates new form formRegister
     */
    public formRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormRegister = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelBackForm = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFormRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsername.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jPanelFormRegister.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 250, 40));

        jLabelBackForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hurufHijaiyah/backLogin.png"))); // NOI18N
        jPanelFormRegister.add(jLabelBackForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        jButtonSubmit.setText("jButton1");
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanelFormRegister.add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 140, 50));

        jButtonBack.setText("jButton1");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelFormRegister.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 123, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFormRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFormRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        this.toBack();
        pilihLevel newFrame = new pilihLevel();
        newFrame.setVisible(true);
        newFrame.toFront();
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSubmitMouseClicked

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new homePage().toFront();
        new homePage().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelBackForm;
    private javax.swing.JPanel jPanelFormRegister;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
