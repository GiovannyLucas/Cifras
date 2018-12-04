package DAO;

import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO extends ExecuteSQL {

    public UsuarioDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String nome, String senha){
        boolean finalResult = false;
        
        try {
            String consulta  = "SELECT nome, senha FROM usuarios WHERE nome = '"+ nome + "' AND senha = '"+ senha +"'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Usuario a = new Usuario();
                    a.setNome(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalResult;
    }
    
    public String Cadastro_Usuario(Usuario a) {
        String sql = "INSERT INTO usuarios VALUES (0,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getSenha());
            ps.setString(4, a.getImg());
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            } else {
                return "Erro ao inserir.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

        public boolean VerificaLogin(String nome){
        boolean finalResult = false;
        
        try {
            String consulta  = "SELECT nome FROM usuarios WHERE nome = '"+ nome +"'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Usuario a = new Usuario();
                    a.setNome(rs.getString(1));
                    finalResult = true;
                }
            }
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalResult;
    }
}
