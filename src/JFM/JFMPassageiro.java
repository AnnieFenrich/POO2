/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFM;

import DAO.PassageiroDAO;
import OverbookPolicy.Aeronave;
import OverbookPolicy.Passageiro;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pazak
 */
public class JFMPassageiro extends javax.swing.JFrame {

    public JFMPassageiro() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTpsg.getModel();
        jTpsg.setRowSorter(new TableRowSorter(modelo));
        readJTablePsg();        
    }
    
     public void readJTablePsg(){
        DefaultTableModel modelo = (DefaultTableModel) jTpsg.getModel();
        modelo.setNumRows(0);
        
        PassageiroDAO adao = new PassageiroDAO();
        
        for(Passageiro p: adao.list()){
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getCpf(),
                p.getCategoria()
            });
        }        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCategoria = new javax.swing.ButtonGroup();
        jPPrincipal = new javax.swing.JPanel();
        Adicionar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTpsg = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbOpcao1 = new javax.swing.JRadioButton();
        rbOpcao2 = new javax.swing.JRadioButton();
        rbOpcao3 = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        EditarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Adicionar.setText("Adicionar");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        jButton4.setText("Pesquisar");

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adicionar)
                    .addComponent(Remover)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTpsg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Cadastro", "Nome", "CPF", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTpsg.getTableHeader().setReorderingAllowed(false);
        jTpsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTpsgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTpsg);
        if (jTpsg.getColumnModel().getColumnCount() > 0) {
            jTpsg.getColumnModel().getColumn(0).setResizable(false);
            jTpsg.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTpsg.getColumnModel().getColumn(1).setResizable(false);
            jTpsg.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTpsg.getColumnModel().getColumn(2).setResizable(false);
            jTpsg.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTpsg.getColumnModel().getColumn(3).setResizable(false);
            jTpsg.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        bgCategoria.add(rbOpcao1);
        rbOpcao1.setText("Comum");

        bgCategoria.add(rbOpcao2);
        rbOpcao2.setText("VIP");

        bgCategoria.add(rbOpcao3);
        rbOpcao3.setText("Preferencial");

        EditarCadastro.setText("Atualizar Cadastro");
        EditarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditarCadastro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rbOpcao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbOpcao2)
                        .addGap(47, 47, 47)
                        .addComponent(rbOpcao3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOpcao1)
                    .addComponent(rbOpcao2)
                    .addComponent(rbOpcao3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
          String selecao;
        
       Passageiro psg = new Passageiro();
       PassageiroDAO pDAO = new PassageiroDAO();
       psg.setNome(txtNome.getText());
       psg.setCpf(txtCpf.getText());
       if (rbOpcao1.isSelected()){
            selecao = "COMUM";
       }else if (rbOpcao2.isSelected()){
            selecao = "VIP";
       }else{
            selecao = "PREFERENCIAL";
       }
       txtNome.setText("");
       
       psg.setCategoria(selecao);    
       pDAO.save(psg);
       readJTablePsg();
       
    }//GEN-LAST:event_AdicionarActionPerformed

    private void EditarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCadastroActionPerformed
       
       String selecao;
        
       Passageiro psg = new Passageiro();
       PassageiroDAO pDAO = new PassageiroDAO();
       psg.setNome(txtNome.getText());
       psg.setCpf(txtCpf.getText());
       if (rbOpcao1.isSelected()){
            selecao = "COMUM";
       }else if (rbOpcao2.isSelected()){
            selecao = "VIP";
       }else{
            selecao = "PREFERENCIAL";
       }
       psg.setId((int) jTpsg.getValueAt(jTpsg.getSelectedRow(), 0));
       psg.setCategoria(selecao);    
       pDAO.update(psg);
       readJTablePsg();       
    }//GEN-LAST:event_EditarCadastroActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        if (jTpsg.getSelectedRow() != -1){
            Passageiro p = new Passageiro();
            PassageiroDAO pDao = new PassageiroDAO();
            
            p.setId((int) jTpsg.getValueAt(jTpsg.getSelectedRow(), 0));
            
            pDao.remove(p);
            readJTablePsg();
            txtNome.setText("");
            txtCpf.setText("");
            
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um passageiro para removelo!");
        }
    }//GEN-LAST:event_RemoverActionPerformed

    private void jTpsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpsgMouseClicked
       
        String option = null;
        
        
        if(jTpsg.getSelectedRow() != -1) {
            txtNome.setText(jTpsg.getValueAt(jTpsg.getSelectedRow(), 1).toString());
            txtCpf.setText(jTpsg.getValueAt(jTpsg.getSelectedRow(), 2).toString());
            
            option = jTpsg.getValueAt(jTpsg.getSelectedRow(), 3).toString();          
            
            if (option.equals ("COMUM")){
                rbOpcao1.setSelected(true);
            }
                
            if (option.equals ("VIP")) {
                rbOpcao2.setSelected(true);
                
            }   
            if (option.equals ("PREFERENCIAL")){
                rbOpcao3.setSelected(true);
            }        
        }
    }//GEN-LAST:event_jTpsgMouseClicked

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
            java.util.logging.Logger.getLogger(JFMPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMPassageiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMPassageiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton EditarCadastro;
    private javax.swing.JButton Remover;
    private javax.swing.ButtonGroup bgCategoria;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jTpsg;
    private javax.swing.JRadioButton rbOpcao1;
    private javax.swing.JRadioButton rbOpcao2;
    private javax.swing.JRadioButton rbOpcao3;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

       
}
