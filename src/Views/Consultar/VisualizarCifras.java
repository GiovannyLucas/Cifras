package Views.Consultar;

import DAO.CifrasDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Cifras;
import Views.Cadastrar.CadastroCifras;
import Views.Consultar.TelaCifras;
import Views.Excluir.rmCifra;
import Views.Update.AlterarCifras;
import Views.Update.AlterarUsuario;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.Login;

public class VisualizarCifras extends javax.swing.JFrame {

    public VisualizarCifras() {
        initComponents();
        setSize(842,569);
        setLocationRelativeTo(this);
        setTitle("Ver e tocar - CIFRA");
        Combo();
    }

    public void Combo(){
        String home = System.getProperty("user.home");
        try {
            File file = new File(home+"/User");
            File afile[] = file.listFiles();
            int i = 0;
            //Pega nome do usuário 
            for (int j = afile.length; i < j; i++) {
                    File arquivos = afile[i];
                    String nome = arquivos.getName();
                    String usuario = nome.substring(0, nome.length()-4);
                    
                    Connection con = Conexao.AbrirConexao();
                    CifrasDAO sql = new CifrasDAO(con);
                    List<Cifras> lista = new ArrayList<>();
                    lista = sql.ListarCombo(usuario);
                    jComboBox1.addItem("");
                    
                    //Lista as cifras do usuário
                    for (Cifras b : lista) {
                        jComboBox1.addItem(b.getNomeMusica());
                    }
                    Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar cookie!", "Projeto Cifras",
                            JOptionPane.ERROR_MESSAGE);
        }    
    }
    String home = System.getProperty("user.home");
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmS = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        fundo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
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

        confirmS.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirmS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmS.setText("Cifra que quer vizualizar:");
        getContentPane().add(confirmS);
        confirmS.setBounds(100, 30, 220, 30);

        jComboBox1.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 18)); // NOI18N
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 60, 310, 50);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/erg.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(40, 140, 330, 330);

        mostrar.setEditable(false);
        mostrar.setColumns(10);
        mostrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mostrar.setRows(1);
        jScrollPane2.setViewportView(mostrar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(410, 10, 400, 480);

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        CifrasDAO sql = new CifrasDAO(con);
        List<Cifras> lista = new ArrayList<>();
        String nome = jComboBox1.getSelectedItem().toString();
        
        lista = sql.ConsultaCifra(nome);
        
        for (Cifras b : lista) {
            mostrar.setText(b.getCifra());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarCifras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmS;
    private javax.swing.JLabel fundo;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mostrar;
    // End of variables declaration//GEN-END:variables
}
