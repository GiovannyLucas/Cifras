package Views.Visualizar;

import Views.Cadastro.CadastroCifras;
import Views.Excluir.rmCifra;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Login;

public class TelaCifras extends javax.swing.JFrame {

    public TelaCifras() {
        initComponents();
        setSize(842,569);
        setLocationRelativeTo(this);
        setTitle("Visualizar cifras");
    }
       

    
    String home = System.getProperty("user.home");
        
        public void Lista() {                  
        String Usu = confirmUsu.getText().toUpperCase();
        String Pass = confirmSen.getText();
        if(Usu.equals("") || Pass.equals("")){
            JOptionPane.showConfirmDialog(null, "Preencha todos os campos!","Aviso!",JOptionPane.CLOSED_OPTION);
        } else {
                     
        String caminhoU = (home+"/Documents/DADOS/"+Usu+"/");
        String caminhoS = (home+"/Documents/DADOS/"+Usu+"/senha.txt");
        
        File path = new File(caminhoU);
        
        if(path.exists()){
            File sen = new File(caminhoS);
            try {         
            FileReader fr = new FileReader(sen);
            BufferedReader br = new BufferedReader(fr);
            String Senha = br.readLine();
                
                if (Senha.equals(Pass)) {
            
                                       
        }       
                fr.close();
                br.close();
            } catch (Exception e) {
                
            }
            
        File pastac = new File(home+"/Documents/DADOS/"+Usu+"/");
        
        File file[] = pastac.listFiles();
        String text = "";
        
        for (int i = 0; i < file.length; i++) {
            File f = file[i];
            text += f.getName()+"\n";
                
            try {
                FileReader fr1 = new FileReader(file[i]);
                BufferedReader br1 = new BufferedReader(fr1);
                String linha;
                
                do {                    
                    linha = br1.readLine();
                    if (linha != null) {
                        String[] word = linha.split(";");
                        
                        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                        Object[] dados = {word[1]+" - "+word[0]};
                        table.addRow(dados);
                    }
                } while (linha != null); 
                fr1.close();
                br1.close();
            } catch (Exception e) {
            }
        
        }

        }
        }
        confirmUsu.setText("");
        confirmSen.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmSen = new javax.swing.JPasswordField();
        btnOk = new javax.swing.JButton();
        confirmS = new javax.swing.JLabel();
        confirmUsu = new javax.swing.JTextField();
        confirm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(confirmSen);
        confirmSen.setBounds(510, 60, 200, 30);

        btnOk.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(720, 30, 110, 50);

        confirmS.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirmS.setText("Cofirmar senha:");
        getContentPane().add(confirmS);
        confirmS.setBounds(390, 60, 110, 30);
        getContentPane().add(confirmUsu);
        confirmUsu.setBounds(510, 20, 200, 30);

        confirm.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirm.setText("Cofirmar usuário:");
        getContentPane().add(confirm);
        confirm.setBounds(390, 20, 110, 30);

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUAS CIFRAS:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 110, 330, 280);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 840, 530);

        jMenu1.setText("Cifras");

        jMenuItem1.setText("Ver suas cifras...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cadastrar nova cifra");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Deletar cifra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Ver cifra - Toque junto!");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");

        jMenuItem3.setText("Logoff...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new CadastroCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        Lista();
    }//GEN-LAST:event_btnOkActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new rmCifra().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new VisualizarCifras().setVisible(true);
        dispose();      
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCifras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel confirm;
    private javax.swing.JLabel confirmS;
    private javax.swing.JPasswordField confirmSen;
    private javax.swing.JTextField confirmUsu;
    private javax.swing.JLabel fundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
