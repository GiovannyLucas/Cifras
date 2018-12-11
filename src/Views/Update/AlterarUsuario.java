package Views.Update;

import DAO.CifrasDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Cifras;
import Models.Usuario;
import Views.Cadastrar.CadastroCifras;
import Views.Consultar.TelaCifras;
import Views.Consultar.VisualizarCifras;
import Views.Excluir.rmCifra;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.Login;

public class AlterarUsuario extends javax.swing.JFrame {

    public AlterarUsuario() {
        initComponents();
        setSize(842, 529);
        setLocationRelativeTo(this);  
        setTitle("Atualizar suas informações");
        Carregar();
    }
    
    private void InserirDados(String usuario){
        Connection con = Conexao.AbrirConexao();
        UsuarioDAO sql = new UsuarioDAO(con);
        List<Usuario> lista = new ArrayList<>();
        lista = sql.CapturarUsuario(usuario);
        
        for (Usuario a : lista) {
            jTF_Cod.setText("" + a.getId());
            jTF_Nome.setText("" + a.getNome());
            jTF_Email.setText("" + a.getEmail());
            jTF_Senha.setText("" + a.getSenha()); 
        }
        
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }

    public void Carregar(){
    String home = System.getProperty("user.home");
        
        File file = new File(home+"/User");
        File afile[] = file.listFiles();
        
        try {
            int i = 0;
            
            for (int j = afile.length; i < j; i++) {
                    File arquivos = afile[i];
                    String nome = arquivos.getName();
                    String usuario = nome.substring(0, nome.length()-4);
                    
                Connection con = Conexao.AbrirConexao();
                UsuarioDAO sql = new UsuarioDAO(con);

                InserirDados(usuario);    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF_Senha = new javax.swing.JPasswordField();
        jTF_Email = new javax.swing.JTextField();
        jTF_Nome = new javax.swing.JTextField();
        sn = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        n1 = new javax.swing.JLabel();
        jTF_Cod = new javax.swing.JTextField();
        s1 = new javax.swing.JLabel();
        jTF_Senha1 = new javax.swing.JPasswordField();
        sn1 = new javax.swing.JLabel();
        jTF_Senha2 = new javax.swing.JPasswordField();
        fundo = new javax.swing.JLabel();
        fundo1 = new javax.swing.JLabel();
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

        jTF_Senha.setEditable(false);
        jTF_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_Senha);
        jTF_Senha.setBounds(270, 310, 120, 30);
        getContentPane().add(jTF_Email);
        jTF_Email.setBounds(420, 250, 230, 30);
        getContentPane().add(jTF_Nome);
        jTF_Nome.setBounds(420, 190, 230, 30);

        sn.setBackground(new java.awt.Color(0, 255, 204));
        sn.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        sn.setForeground(new java.awt.Color(0, 255, 0));
        sn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sn.setText("E-mail:");
        getContentPane().add(sn);
        sn.setBounds(200, 250, 200, 30);

        n.setBackground(new java.awt.Color(0, 255, 204));
        n.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        n.setForeground(new java.awt.Color(0, 255, 0));
        n.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n.setText("Nome (usuário):");
        getContentPane().add(n);
        n.setBounds(210, 190, 190, 30);

        s.setBackground(new java.awt.Color(0, 255, 204));
        s.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        s.setForeground(new java.awt.Color(0, 255, 0));
        s.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s.setText("Senha(antiga):");
        getContentPane().add(s);
        s.setBounds(70, 310, 180, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATUALIZAR SUAS INFORMAÇÕES");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 50, 550, 50);

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 410, 150, 50);

        n1.setBackground(new java.awt.Color(0, 255, 204));
        n1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(0, 255, 0));
        n1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        n1.setText("Código:");
        getContentPane().add(n1);
        n1.setBounds(210, 130, 190, 30);

        jTF_Cod.setEditable(false);
        jTF_Cod.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTF_Cod);
        jTF_Cod.setBounds(420, 130, 230, 30);

        s1.setBackground(new java.awt.Color(0, 255, 204));
        s1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        s1.setForeground(new java.awt.Color(0, 255, 0));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s1.setText("Repita a senha:");
        getContentPane().add(s1);
        s1.setBounds(410, 310, 200, 30);

        jTF_Senha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_Senha1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_Senha1);
        jTF_Senha1.setBounds(420, 360, 230, 30);

        sn1.setBackground(new java.awt.Color(0, 255, 204));
        sn1.setFont(new java.awt.Font("Ravie", 0, 18)); // NOI18N
        sn1.setForeground(new java.awt.Color(0, 255, 0));
        sn1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sn1.setText("Senha(atual):");
        getContentPane().add(sn1);
        sn1.setBounds(200, 360, 200, 30);

        jTF_Senha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_Senha2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_Senha2);
        jTF_Senha2.setBounds(630, 310, 120, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/f0811ed5abd581e705ea5bf71a81ff5d.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(190, 0, 640, 500);

        fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/f0811ed5abd581e705ea5bf71a81ff5d.jpg"))); // NOI18N
        getContentPane().add(fundo1);
        fundo1.setBounds(0, 0, 640, 500);

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

    private void jTF_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_SenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nome = jTF_Nome.getText();
    String email = jTF_Email.getText();
    String senhaConfirm = jTF_Senha2.getText();
    String senhaMudar = jTF_Senha1.getText();
    String senhaAntiga = jTF_Senha.getText();
    
    if (nome.equals("") || email.equals("")) {
        JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!",
                    "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
    } else {
        Connection con = Conexao.AbrirConexao();
        UsuarioDAO sql = new UsuarioDAO(con);
        Usuario a = new Usuario();
        
        if (senhaAntiga.equals(senhaConfirm)) {
            a.setNome(nome);
            a.setEmail(email);
            a.setSenha(senhaMudar);
            
            String home = System.getProperty("user.home");
            try {
                File file = new File(home+"/User");
                File afile[] = file.listFiles();
                int i = 0;

                for (int j = afile.length; i < j; i++) {
                        File arquivos = afile[i];
                        String aaaaa = arquivos.getName();
                        String usuario = aaaaa.substring(0, aaaaa.length()-4);
                        
                        sql.Alterar_Usuario(a, usuario);
                        
                    jTF_Nome.setText("");
                    jTF_Email.setText("");
                    jTF_Senha2.setText("");
                    jTF_Senha1.setText("");
                    jTF_Senha.setText("");  

                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!",
                                "Projeto Cifras", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new AlterarUsuario().setVisible(true);
                }
            } catch (Exception e) {
            }
                 
                
        } else 
        if (senhaMudar.equals("")){
            a.setNome(nome);
            a.setEmail(email);
            
            String home = System.getProperty("user.home");
            try {
                File file = new File(home+"/User");
                File afile[] = file.listFiles();
                int i = 0;

                for (int j = afile.length; i < j; i++) {
                        File arquivos = afile[i];
                        String aaaaa = arquivos.getName();
                        String usuario = aaaaa.substring(0, aaaaa.length()-4);
                        
                        sql.Alterar_Usuario(a, usuario);
                        
                    jTF_Nome.setText("");
                    jTF_Email.setText("");
                    jTF_Senha2.setText("");
                    jTF_Senha1.setText("");
                    jTF_Senha.setText("");  

                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!",
                                "Projeto Cifras", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new AlterarUsuario().setVisible(true);
                }
            } catch (Exception e) {
            }

        } else
        if (senhaAntiga != senhaConfirm) {
            JOptionPane.showMessageDialog(null, "A senha digitada está incorreta!","Projeto Cifras", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
 
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTF_Senha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_Senha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_Senha1ActionPerformed

    private void jTF_Senha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_Senha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_Senha2ActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AlterarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel fundo1;
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
    private javax.swing.JTextField jTF_Cod;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JPasswordField jTF_Senha;
    private javax.swing.JPasswordField jTF_Senha1;
    private javax.swing.JPasswordField jTF_Senha2;
    private javax.swing.JLabel n;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel s;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel sn;
    private javax.swing.JLabel sn1;
    // End of variables declaration//GEN-END:variables
}
