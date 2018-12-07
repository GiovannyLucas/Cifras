package Views.Consultar;

import DAO.CifrasDAO;
import DAO.Conexao;
import Models.Cifras;
import Views.Cadastrar.CadastroCifras;
import Views.Excluir.rmCifra;
import Views.Visualizar.VisualizarCifras;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Login;

public class TelaCifras extends javax.swing.JFrame {

    public TelaCifras() {
        initComponents();
        setSize(841, 460);
        setLocationRelativeTo(this);
        setTitle("Visualizar cifras");
        AtualizaTable();
    }

    private void AtualizaTable() {
        String home = System.getProperty("user.home");
        try {
            File file = new File(home+"/User");
            File afile[] = file.listFiles();
            int i = 0;
            
            for (int j = afile.length; i < j; i++) {
                File arquivos = afile[i];
                String nome = arquivos.getName();
                String usuario = nome.substring(0, nome.length()-4);
                    
                    Connection con = Conexao.AbrirConexao();
                    CifrasDAO bd = new CifrasDAO(con);
                    List<Cifras> lista = new ArrayList<>();
                    lista = bd.ListarCifras(usuario);
                    DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();

                    while (tbm.getRowCount() > 0) {
                        tbm.removeRow(0);
                    }

                    int ii = 0;
                    for (Cifras tab : lista) {
                        tbm.addRow(new String[ii]);
                        jTable.setValueAt(tab.getIdCifra(), ii, 0);
                        jTable.setValueAt(tab.getNomeMusica(), ii, 1);
                        jTable.setValueAt(tab.getNomeCantor(), ii, 2);
                        jTable.setValueAt(tab.getTom(), ii, 3);
                        ii++;
                    }
                    Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
            }
        } catch (Exception e) {
        }
        
        
    }

    String home = System.getProperty("user.home");
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        pesqNome = new javax.swing.JTextField();
        confirm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        fundo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        btnOk.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-de-pesquisa-png.png"))); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(480, 10, 90, 50);

        pesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqNomeActionPerformed(evt);
            }
        });
        getContentPane().add(pesqNome);
        pesqNome.setBounds(210, 20, 240, 30);

        confirm.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirm.setText("Pesquisar por nome:");
        getContentPane().add(confirm);
        confirm.setBounds(70, 20, 140, 30);

        jTable.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Música", "Cantor", "Tom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 810, 260);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/237908610025212.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(290, 330, 300, 80);

        jButton1.setText("Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 20, 65, 32);

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
        String home = System.getProperty("user.home");
        try {
            File file = new File(home+"/User");
            File afile[] = file.listFiles();
            int i = 0;
            
            for (int j = afile.length; i < j; i++) {
                    File arquivos = afile[i];
                    String nome = arquivos.getName();
                    String usuario = nome.substring(0, nome.length()-4);
                    
                String pesquisarNome = pesqNome.getText();
        
                Connection con = Conexao.AbrirConexao();
                CifrasDAO bd = new CifrasDAO(con);
                List<Cifras> lista = new ArrayList<>();
                lista = bd.Pesquisar_Nome_Cifras(usuario,pesquisarNome); 
                DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();

                while (tbm.getRowCount() > 0) {
                    tbm.removeRow(0);
                }

                int ii = 0;
                for (Cifras tab : lista) {
                    tbm.addRow(new String[ii]);
                    jTable.setValueAt(tab.getIdCifra(), ii, 0);
                    jTable.setValueAt(tab.getNomeMusica(), ii, 1);
                    jTable.setValueAt(tab.getNomeCantor(), ii, 2);
                    jTable.setValueAt(tab.getTom(), ii, 3);
                    ii++;
                }
                pesqNome.setText("");
                Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
                    
            }
        } catch (Exception e) {
        }       
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

    private void pesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesqNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AtualizaTable();
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField pesqNome;
    // End of variables declaration//GEN-END:variables
}
