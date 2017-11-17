/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFM;



/**
 *
 * @author pazak
 */
public class MainOBP extends javax.swing.JFrame {
 
    /**
     * Creates new form MainOBP
     */
    public MainOBP() {
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

        jpPainelPrincipal = new javax.swing.JPanel();
        jbCadastroPsg = new javax.swing.JButton();
        jbCadastroArn = new javax.swing.JButton();
        jbCadastroVoo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red Wings - Linhas Aereas");
        setLocation(new java.awt.Point(400, 300));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setResizable(false);

        jbCadastroPsg.setText("Cadastrar Passageiro");
        jbCadastroPsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroPsgActionPerformed(evt);
            }
        });

        jbCadastroArn.setText("Cadastrar Aeronave");
        jbCadastroArn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroArnActionPerformed(evt);
            }
        });

        jbCadastroVoo.setText("Cadastrar Voo");
        jbCadastroVoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroVooActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPainelPrincipalLayout = new javax.swing.GroupLayout(jpPainelPrincipal);
        jpPainelPrincipal.setLayout(jpPainelPrincipalLayout);
        jpPainelPrincipalLayout.setHorizontalGroup(
            jpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jbCadastroPsg)
                .addGap(80, 80, 80)
                .addComponent(jbCadastroArn)
                .addGap(101, 101, 101)
                .addComponent(jbCadastroVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jpPainelPrincipalLayout.setVerticalGroup(
            jpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelPrincipalLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastroPsg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastroArn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastroVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroPsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroPsgActionPerformed
            new JFMPassageiro().setVisible(true);
    }//GEN-LAST:event_jbCadastroPsgActionPerformed

    private void jbCadastroArnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroArnActionPerformed
            new JFMAeronave().setVisible(true);   
    }//GEN-LAST:event_jbCadastroArnActionPerformed

    private void jbCadastroVooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroVooActionPerformed
            new JFMVoo().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jbCadastroVooActionPerformed

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
            java.util.logging.Logger.getLogger(MainOBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainOBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainOBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainOBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainOBP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastroArn;
    private javax.swing.JButton jbCadastroPsg;
    private javax.swing.JButton jbCadastroVoo;
    private javax.swing.JPanel jpPainelPrincipal;
    // End of variables declaration//GEN-END:variables
}