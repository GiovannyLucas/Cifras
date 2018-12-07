package Views.Cadastrar;

import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Usuario;
import java.io.File;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import main.Login;


public class CadastrarUsuario extends javax.swing.JFrame {

    public CadastrarUsuario() {
        initComponents();
        setSize(842, 529);
        setLocationRelativeTo(this);  
        setTitle("Cadastro");
    }
        
    public void LimparCampos(){
        jTF_Nome.setText("");
        jTF_Email.setText("");
        jTF_Senha.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTF_Senha = new javax.swing.JPasswordField();
        jTF_Email = new javax.swing.JTextField();
        jTF_Nome = new javax.swing.JTextField();
        sn = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(700, 440, 90, 30);

        titulo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 38)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRE-SE!");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        getContentPane().add(titulo);
        titulo.setBounds(140, 50, 570, 60);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 380, 160, 60);

        jTF_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_Senha);
        jTF_Senha.setBounds(410, 280, 230, 30);
        getContentPane().add(jTF_Email);
        jTF_Email.setBounds(410, 230, 230, 30);
        getContentPane().add(jTF_Nome);
        jTF_Nome.setBounds(410, 180, 230, 30);

        sn.setBackground(new java.awt.Color(0, 255, 204));
        sn.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        sn.setForeground(new java.awt.Color(0, 255, 0));
        sn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sn.setText("E-mail:");
        getContentPane().add(sn);
        sn.setBounds(190, 230, 200, 30);

        n.setBackground(new java.awt.Color(0, 255, 204));
        n.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        n.setForeground(new java.awt.Color(0, 255, 0));
        n.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n.setText("Nome (usuário):");
        getContentPane().add(n);
        n.setBounds(190, 180, 190, 30);

        s.setBackground(new java.awt.Color(0, 255, 204));
        s.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        s.setForeground(new java.awt.Color(0, 255, 0));
        s.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s.setText("Senha:");
        getContentPane().add(s);
        s.setBounds(190, 280, 200, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/guitar-2222350_960_720.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 830, 500);

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
            UsuarioDAO sql = new UsuarioDAO(con);
            Usuario a = new Usuario();
            
            a.setNome(nome);
            a.setEmail(email);
            a.setSenha(senha);
            
            sql.Cadastro_Usuario(a);
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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JPasswordField jTF_Senha;
    private javax.swing.JLabel n;
    private javax.swing.JLabel s;
    private javax.swing.JLabel sn;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
