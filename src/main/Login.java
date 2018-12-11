package main;

import DAO.Conexao;
import DAO.UsuarioDAO;
import Views.Cadastrar.CadastrarUsuario;
import Views.Consultar.TelaCifras;
import java.io.File;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setSize(842, 529);
        setLocationRelativeTo(this);   
        setTitle("Login");
        criarPasta();
        apagarUsers();
    }
    
    public void criarPasta(){
        String home = System.getProperty("user.home");
        File pastaUser = new File(home+"/User");
        if (!pastaUser.exists()) {
            pastaUser.mkdir();
        }
    }
    
    public void apagarUsers(){
        String home = System.getProperty("user.home");
            try {
                File file = new File(home+"/User");
                File afile[] = file.listFiles();
                int i = 0;

                for (int j = afile.length; i < j; i++) {
                    File arquivos = afile[i];
                    arquivos.delete();
                }
            } catch (Exception e) {
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        passLog = new javax.swing.JPasswordField();
        nomeUsu = new javax.swing.JTextField();
        n = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        titulo1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 0, 0));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titulo1.setText("OU");
        getContentPane().add(titulo1);
        titulo1.setBounds(550, 360, 90, 20);

        titulo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 38)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 255, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("LOGIN");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        getContentPane().add(titulo);
        titulo.setBounds(130, 50, 570, 60);

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(150, 460, 560, 12);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jButton2.setText("CADASTRE-SE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 380, 120, 36);

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 280, 140, 60);

        passLog.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        passLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passLogActionPerformed(evt);
            }
        });
        getContentPane().add(passLog);
        passLog.setBounds(410, 220, 230, 30);

        nomeUsu.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        nomeUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuActionPerformed(evt);
            }
        });
        getContentPane().add(nomeUsu);
        nomeUsu.setBounds(410, 150, 230, 30);

        n.setBackground(new java.awt.Color(204, 204, 204));
        n.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        n.setForeground(new java.awt.Color(255, 0, 0));
        n.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n.setText("Nome (usuário):");
        getContentPane().add(n);
        n.setBounds(190, 150, 190, 30);

        s.setBackground(new java.awt.Color(204, 204, 204));
        s.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        s.setForeground(new java.awt.Color(255, 0, 0));
        s.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s.setText("Senha:");
        getContentPane().add(s);
        s.setBounds(180, 220, 200, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/guitar-2222350_960_720.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 840, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        UsuarioDAO sql = new UsuarioDAO(con);
        String nome = nomeUsu.getText();
        String senha = passLog.getText();
        
        if (nome.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!",
                    "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
            nomeUsu.setText("");
            passLog.setText("");
        } else {
            if (sql.Logar(nome, senha) == true) {
                
                String home = System.getProperty("user.home");
                File pastaUsu = new File(home+"/User/"+ nome +".txt");
                
                try {
                    
                    if (!pastaUsu.exists()) {
                        pastaUsu.createNewFile();
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao criar cookie.", "Projeto Cifras",
                            JOptionPane.ERROR_MESSAGE);
                }
                
                new Thread(){
                    public void run() {
                        for (int i = 0; i < 101; i++) {
                            jProgressBar1.setValue(i);
                            try {
                                Thread.sleep(10);
                            } catch (Exception ex) {
                                ex.getMessage();
                            }
                        }
                    new TelaCifras().setVisible(true);
                    dispose();
                    }
                }.start();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido(s)",
                    "Projeto Cifras", JOptionPane.ERROR_MESSAGE);
                nomeUsu.setText("");
                passLog.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passLogActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CadastrarUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nomeUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel n;
    private javax.swing.JTextField nomeUsu;
    private javax.swing.JPasswordField passLog;
    private javax.swing.JLabel s;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
