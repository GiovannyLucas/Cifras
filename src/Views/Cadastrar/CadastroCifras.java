package Views.Cadastrar;

import DAO.CifrasDAO;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Models.Cifras;
import Models.Usuario;
import javax.swing.JOptionPane;
import main.Login;
import Views.Consultar.TelaCifras;
import Views.Visualizar.VisualizarCifras;
import Views.Excluir.rmCifra;
import java.io.File;
import java.sql.Connection;

public class CadastroCifras extends javax.swing.JFrame {


    public CadastroCifras() {
        initComponents();
        setSize(852, 572);
        setLocationRelativeTo(this);  
        setTitle("Cadastrar cifras");
    }
    
    public void LimparCampos() {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tomM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cantorM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cifra = new javax.swing.JTextArea();
        fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("*");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(530, 140, 10, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("*");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 180, 10, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("*");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 100, 10, 14);

        ok.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        ok.setText("Cadastrar!");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(570, 460, 130, 50);

        jLabel6.setText("Img by: Jocals");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 500, 100, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel5.setText("CIFRA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 230, 60, 30);
        getContentPane().add(tomM);
        tomM.setBounds(590, 180, 210, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel4.setText("TOM:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 180, 110, 30);
        getContentPane().add(cantorM);
        cantorM.setBounds(590, 140, 210, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        jLabel3.setText("CANTOR:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 140, 110, 30);
        getContentPane().add(nomeM);
        nomeM.setBounds(590, 100, 210, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setText("NOME DA MÚSICA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 100, 110, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRE SUAS CIFRAS!");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 30, 410, 50);

        cifra.setColumns(20);
        cifra.setRows(5);
        jScrollPane1.setViewportView(cifra);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(473, 220, 330, 230);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 842, 530);

        jMenu1.setText("Cifras");

        jMenuItem1.setText("Ver todas as cifras...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Cadastrar nova cifra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CadastroCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new rmCifra().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new VisualizarCifras().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String home = System.getProperty("user.home");
        try {
            File file = new File(home+"/User");
            File afile[] = file.listFiles();
            int i = 0;

            for (int j = afile.length; i < j; i++) {
                File arquivos = afile[i];
                String nome = arquivos.getName();
                String usuario = nome.substring(0, nome.length()-4);

                String nomeUsuario = usuario;
                String nomeMusica = nomeM.getText();
                String cantor = cantorM.getText();
                String tom = tomM.getText();
                String cifraMusica = cifra.getText();

                if (nomeMusica.equals("") || cantor.equals("") || tom.equals("") || cifraMusica.equals("")
                    || nomeUsuario.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!",
                        "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
                } else {
                    Connection con = Conexao.AbrirConexao();
                    UsuarioDAO u = new UsuarioDAO(con);
                    Usuario usu = new Usuario();
                    CifrasDAO sql = new CifrasDAO(con);
                    Cifras a = new Cifras();

                    usu.setNome(nomeUsuario);
                    u.VerificaLogin(nomeUsuario);

                    if (u.VerificaLogin(nomeUsuario) == true) {
                        a.setNomeUsuario(nomeUsuario);
                        a.setNomeMusica(nomeMusica);
                        a.setNomeCantor(cantor);
                        a.setTom(tom);
                        a.setCifra(cifraMusica);

                        sql.Cadastro_Cifra(a);

                        JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!",
                            "Projeto Cifras", JOptionPane.INFORMATION_MESSAGE);

                        nomeM.setText("");
                        cantorM.setText("");
                        tomM.setText("");
                        cifra.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário incorreto!",
                            "Projeto Cifras", JOptionPane.WARNING_MESSAGE);
                    }
                    Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar cookie!",
                            "Projeto Cifras", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_okActionPerformed
      
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
            java.util.logging.Logger.getLogger(CadastroCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCifras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCifras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantorM;
    private javax.swing.JTextArea cifra;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeM;
    private javax.swing.JButton ok;
    private javax.swing.JTextField tomM;
    // End of variables declaration//GEN-END:variables
}