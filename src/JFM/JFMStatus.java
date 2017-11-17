/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFM;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author pazak
 */
public class JFMStatus extends javax.swing.JFrame {

    /**
     * Creates new form JFMStatus
     */
    public JFMStatus() {
        initComponents();
        new Thread() {
            public void run(){
            
                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(100);
                        jProgressBar1.setValue(i);
                        if  (i == 1){
                            jLabel1.setText("Iniciando Embarque.");
                        }if (i == 2){
                            jLabel1.setText("Iniciando Embarque..");
                        }if (i == 3){
                            jLabel1.setText("Iniciando Embarque...");
                        }if (i == 4){
                            jLabel1.setText("Iniciando Embarque.");
                        }if (i == 5){
                            jLabel1.setText("Iniciando Embarque..");
                        }if (i == 6){
                            jLabel1.setText("Iniciando Embarque...");
                        }if (i == 7){
                            jLabel1.setText("Iniciando Embarque.");
                        }if (i == 8){
                            jLabel1.setText("Iniciando Embarque..");
                        }if (i == 9){
                            jLabel1.setText("Iniciando Embarque...");
                        }if (i == 10){
                            jLabel1.setText("Abastecendo Avião.");
                        }if (i == 11){
                            jLabel1.setText("Abastecendo Avião..");
                        }if (i == 12){
                            jLabel1.setText("Abastecendo Avião...");
                        }if (i == 13){
                            jLabel1.setText("Abastecendo Avião.");
                        }if (i == 14){
                            jLabel1.setText("Abastecendo Avião..");
                        }if (i == 15){
                            jLabel1.setText("Abastecendo Avião...");
                        }if (i == 16){
                            jLabel1.setText("Abastecendo Avião.");
                        }if (i == 17){
                            jLabel1.setText("Abastecendo Avião..");
                        }if (i == 18){
                            jLabel1.setText("Abastecendo Avião...");
                        }if (i == 19){
                            jLabel1.setText("Abastecendo Avião...");
                        }if (i == 20){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 21){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 22){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 23){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 24){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 25){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 26){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 27){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 28){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 29){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 30){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 31){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 32){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 33){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 34){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 35){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 36){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 37){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 38){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 39){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 40){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 50){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 51){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 52){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 53){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 54){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 55){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 56){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 57){
                            jLabel1.setText("Carregando Bagagens..");
                        }if (i == 58){
                            jLabel1.setText("Carregando Bagagens...");
                        }if (i == 59){
                            jLabel1.setText("Carregando Bagagens.");
                        }if (i == 60){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 61){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 62){
                            jLabel1.setText("Iniciando testes de equipamentos...");
                        }if (i == 63){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 64){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 65){
                            jLabel1.setText("Iniciando testes de equipamentos...");
                        }if (i == 66){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 67){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 68){
                            jLabel1.setText("Iniciando testes de equipamentos...");
                        }if (i == 69){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 70){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 71){
                            jLabel1.setText("Iniciando testes de equipamentos...");
                        }if (i == 72){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 73){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 74){
                            jLabel1.setText("Iniciando testes de equipamentos...");
                        }if (i == 75){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 76){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 77){
                            jLabel1.setText("Iniciando testes de equipamentos...");
                        }if (i == 78){
                            jLabel1.setText("Iniciando testes de equipamentos.");
                        }if (i == 79){
                            jLabel1.setText("Iniciando testes de equipamentos..");
                        }if (i == 80){
                            jLabel1.setText("Verificando passageiros da lista...");
                        }if (i == 81){
                            jLabel1.setText("Verificando passageiros da lista.");
                        }if (i == 82){
                            jLabel1.setText("Verificando passageiros da lista..");
                        }if (i == 83){
                            jLabel1.setText("Verificando passageiros da lista...");
                        }if (i == 84){
                            jLabel1.setText("Verificando passageiros da lista.");
                        }if (i == 85){
                            jLabel1.setText("Verificando passageiros da lista..");
                        }if (i == 86){
                            jLabel1.setText("Verificando passageiros da lista...");
                        }if (i == 87){
                            jLabel1.setText("Verificando passageiros da lista.");
                        }if (i == 88){
                            jLabel1.setText("Verificando passageiros da lista..");
                        }if (i == 89){
                            jLabel1.setText("Verificando passageiros da lista...");
                        }if (i == 90){
                            jLabel1.setText("Verificando passageiros da lista.");
                        }if (i == 91){
                            jLabel1.setText("Verificando passageiros da lista..");
                        }if (i == 92){
                            jLabel1.setText("Verificando passageiros da lista...");
                        }if (i == 93){
                            jLabel1.setText("Verificando passageiros da lista.");
                        }if (i == 94){
                            jLabel1.setText("Verificando passageiros da lista..");
                        }if (i == 95){
                            jLabel1.setText("Imprimindo listas...");
                        }if (i == 96){
                            jLabel1.setText("Imprimindo listas.");
                        }if (i == 97){
                            jLabel1.setText("Imprimindo listas..");
                        }if (i == 98){
                            jLabel1.setText("Imprimindo listas...");
                        }if (i == 99){
                            jLabel1.setText("Imprimindo listas.");
                        }if (i == 100){
                            jLabel1.setText("VERIFICAÇÃO COMPLETA!");
                        }
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(JFMStatus.class.getName()).log(Level.SEVERE, null, ex);
                    }
                             
                    
                }
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(JFMStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        }.start();
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(811, 685));
        setResizable(false);

        jProgressBar1.setStringPainted(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciando Embarque.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFMStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
