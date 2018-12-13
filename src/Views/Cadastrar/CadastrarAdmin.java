package Views.Cadastrar;

import DAO.AdminDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Admin;
import Models.Usuario;
import Views.Consultar.VisualizarCifrasAdmin;
import Views.Consultar.VisualizarUsuariosAdmin;
import Views.Update.AlterarAdmin;
import java.io.File;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import main.Login;
import main.LoginAdmin;


public class CadastrarAdmin extends javax.swing.JFrame {

    public CadastrarAdmin() {
        initComponents();
        setSize(842, 529);
        setLocationRelativeTo(this);  
        setTitle("Cadastro Administrador");
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTF_Senha = new javax.swing.JPasswordField();
        jTF_Email = new javax.swing.JTextField();
        jTF_Nome = new javax.swing.JTextField();
        sn = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 360, 160, 60);

        jTF_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_Senha);
        jTF_Senha.setBounds(360, 260, 230, 30);
        getContentPane().add(jTF_Email);
        jTF_Email.setBounds(360, 180, 230, 30);
        getContentPane().add(jTF_Nome);
        jTF_Nome.setBounds(360, 100, 230, 30);

        sn.setBackground(new java.awt.Color(0, 255, 204));
        sn.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        sn.setForeground(new java.awt.Color(0, 255, 0));
        sn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sn.setText("E-mail:");
        getContentPane().add(sn);
        sn.setBounds(140, 180, 200, 30);

        n.setBackground(new java.awt.Color(0, 255, 204));
        n.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        n.setForeground(new java.awt.Color(0, 255, 0));
        n.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n.setText("Nome:");
        getContentPane().add(n);
        n.setBounds(140, 100, 190, 30);

        s.setBackground(new java.awt.Color(0, 255, 204));
        s.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        s.setForeground(new java.awt.Color(0, 255, 0));
        s.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s.setText("Senha:");
        getContentPane().add(s);
        s.setBounds(140, 260, 200, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/notas.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(160, 60, 530, 310);

        jMenu3.setText("Opções");

        jMenuItem1.setText("Visualizar Usuários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem4.setText("Visualizar Cifras");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Sua conta");

        jMenuItem6.setText("Atualizar seus dados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setText("Cadastrar outro ADM");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nome = jTF_Nome.getText();
    String email = jTF_Email.getText();
    String senha = jTF_Senha.getText();
        if (nome.equals("") || email.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!", 
                    "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            AdminDAO sql = new AdminDAO(con);
            Admin a = new Admin();
            
            a.setNome(nome);
            a.setEmail(email);
            a.setSenha(senha);
            
            sql.Cadastrar_Admin(a);
            Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
            
    jTF_Nome.setText("");
    jTF_Email.setText("");
    jTF_Senha.setText("");
    
    JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!",
            "Projeto Cifras", JOptionPane.INFORMATION_MESSAGE);    
    
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTF_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_SenhaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new VisualizarUsuariosAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new VisualizarCifrasAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new AlterarAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new CadastrarAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String home = System.getProperty("user.home");
        try {
            File file = new File(home+"/Adm");
            File afile[] = file.listFiles();
            int i = 0;

            for (int j = afile.length; i < j; i++) {
                File arquivos = afile[i];
                arquivos.delete();
            }
        } catch (Exception e) {
        }

        new LoginAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JPasswordField jTF_Senha;
    private javax.swing.JLabel n;
    private javax.swing.JLabel s;
    private javax.swing.JLabel sn;
    // End of variables declaration//GEN-END:variables
}
