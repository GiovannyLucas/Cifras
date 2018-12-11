package Views.Consultar;

import DAO.CifrasDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Cifras;
import Views.Cadastrar.CadastroCifras;
import Views.Excluir.rmCifra;
import Views.Update.AlterarCifras;
import Views.Update.AlterarUsuario;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.Login;

public class TelaCifras extends javax.swing.JFrame {

    public TelaCifras() {
        initComponents();
        setSize(857, 460);
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

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
        btnOk.setBounds(490, 60, 90, 50);

        pesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqNomeActionPerformed(evt);
            }
        });
        pesqNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesqNomeKeyPressed(evt);
            }
        });
        getContentPane().add(pesqNome);
        pesqNome.setBounds(220, 70, 240, 30);

        confirm.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirm.setText("Pesquisar por nome:");
        getContentPane().add(confirm);
        confirm.setBounds(80, 70, 140, 30);

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
        jScrollPane1.setBounds(20, 120, 810, 200);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/237908610025212.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(310, 330, 300, 80);

        jButton1.setText("Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 70, 80, 32);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Suas cifras!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 280, 40);

        jMenu1.setText("Cifras");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Ver todas as cifras...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Cadastrar nova cifra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Deletar cifra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Alterar cifra");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Ver cifra - Toque junto!");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Sua conta");

        jMenuItem8.setText("Visualizar/Alterar seus dados");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem10.setText("Remover minha conta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Sair");

        jMenuItem2.setText("Logoff...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void pesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesqNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AtualizaTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CadastroCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new rmCifra().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new AlterarCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new VisualizarCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new AlterarUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Connection con = Conexao.AbrirConexao();
        UsuarioDAO sql = new UsuarioDAO(con);

        int b = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir sua conta?", "Projeto Cifras",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (b == 0) {
            String home = System.getProperty("user.home");
            try {
                File file = new File(home+"/User");
                File afile[] = file.listFiles();
                int i = 0;

                for (int j = afile.length; i < j; i++) {
                    File arquivos = afile[i];
                    String nome = arquivos.getName();
                    String usuario = nome.substring(0, nome.length()-4);

                    sql.Excluir_Usuario(usuario);
                    Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
                    dispose();
                    new Login().setVisible(true);
                }
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Connection con = Conexao.AbrirConexao();
        UsuarioDAO sql = new UsuarioDAO(con);

        int b = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Projeto Cifras",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (b == 0) {
            String home = System.getProperty("user.home");
            try {
                File file = new File(home+"/User");
                File afile[] = file.listFiles();
                int i = 0;

                for (int j = afile.length; i < j; i++) {
                    File arquivos = afile[i];
                    arquivos.delete();

                    new Login().setVisible(true);
                    dispose();

                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void pesqNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesqNomeKeyPressed

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
                //pesqNome.setText("");
                Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
                    
            }
        } catch (Exception e) {
        }       

        

        // TODO add your handling code here:
    }//GEN-LAST:event_pesqNomeKeyPressed


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField pesqNome;
    // End of variables declaration//GEN-END:variables
}
