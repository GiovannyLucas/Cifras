package DAO;

import Models.Admin;
import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO extends ExecuteSQL {

    public AdminDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String nome, String senha){
        boolean finalResult = false;
        
        try {
            String consulta  = "SELECT nome, senha FROM admin WHERE nome = '"+ nome + "' AND senha = '"+ senha +"'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Admin a = new Admin();
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
    
    public String Cadastrar_Usuario(Usuario a) {
        String sql = "INSERT INTO usuarios VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getSenha());
            
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
        
    public List<Usuario> ListarUsuarios() {
        String sql = "SELECT id,nome,email FROM usuarios";
        List<Usuario> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Usuario a = new Usuario();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Admin> CapturarAdmin(String usuario){
        String sql = "SELECT * FROM admin WHERE nome = '"+ usuario + "'";
        List<Admin> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {                    
                    Admin a = new Admin();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    a.setSenha(rs.getString(4));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }

   public String Alterar_Admin(Admin a, String usuario){
        String sql = "UPDATE admin SET nome = ?, email = ?, senha = ? "+
                     "WHERE nome = '"+ usuario +"'";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getSenha());
            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso!";
            } else {
                return "Erro ao atualizar!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String Excluir_Usuario(String usuario){
        String sql = "DELETE FROM usuarios WHERE nome = '"+ usuario +"'";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao excluir!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }    
}
