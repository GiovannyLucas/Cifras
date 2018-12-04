package Views.Visualizar;

import DAO.CifrasDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Cifras;
import Models.Usuario;
import Views.Cadastro.CadastroCifras;
import Views.Excluir.rmCifra;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import main.Login;

public class VisualizarCifras extends javax.swing.JFrame {

    public VisualizarCifras() {
        initComponents();
        setSize(842,569);
        setLocationRelativeTo(this);
        setTitle("Ver e tocar - CIFRA");
        AtualizaCombo();
    }
    
    private void AtualizaCombo(){
        Connection con = Conexao.AbrirConexao();
        CifrasDAO sql = new CifrasDAO(con);
        List<Cifras> lista = new ArrayList<>();
        String usuario = usu.getText();
        lista = sql.ListarCombo(usuario);
        jComboBox1.addItem("");
        
        for (Cifras b : lista) {
            jComboBox1.addItem(b.getNomeMusica());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
  
    String home = System.getProperty("user.home");
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        confirmS = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        confirm = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(110, 330, 140, 90);

        confirmS.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirmS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmS.setText("Cifra que quer vizualizar:");
        getContentPane().add(confirmS);
        confirmS.setBounds(60, 200, 220, 30);
        getContentPane().add(usu);
        usu.setBounds(60, 120, 220, 30);

        confirm.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirm.setText("Cofirmar usuário:");
        getContentPane().add(confirm);
        confirm.setBounds(60, 90, 220, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(420, 250, 260, 220);

        mostrar.setEditable(false);
        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane2.setViewportView(mostrar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 60, 460, 150);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(60, 230, 220, 30);

        jMenu1.setText("Cifras");

        jMenuItem1.setText("Ver todas as cifras...");
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
        Connection con = Conexao.AbrirConexao();
        CifrasDAO sql = new CifrasDAO(con);
        List<Cifras> lista = new ArrayList<>();
        String usuario = usu.getText();
        lista = sql.ListarCombo(usuario);
        jComboBox1.addItem("");
        
        for (Cifras b : lista) {
            jComboBox1.addItem(b.getNomeMusica());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_btnOkActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new rmCifra().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel confirm;
    private javax.swing.JLabel confirmS;
    private javax.swing.JLabel fundo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}
