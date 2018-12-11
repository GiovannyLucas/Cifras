package DAO;

import Models.Cifras;
import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CifrasDAO extends ExecuteSQL {

    public CifrasDAO(Connection con) {
        super(con);
    }
    
    public String Cadastro_Cifra(Cifras a) {
        String sql = "INSERT INTO cifras VALUES (0,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNomeUsuario());
            ps.setString(2, a.getNomeMusica());
            ps.setString(3, a.getNomeCantor());
            ps.setString(4, a.getTom());
            ps.setString(5, a.getCifra());
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            } else {
                return "Erro ao inserir.";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<Cifras> ListarCombo(String nome){
        String sql = "SELECT nome_musica FROM cifras WHERE nome_usuario = '"+nome+"' ORDER BY nome_musica";
        List<Cifras> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Cifras a = new Cifras();
                    a.setNomeMusica(rs.getString(1));
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

    public List<Cifras> ConsultaCifra(String nome){
        String sql = "SELECT cifra FROM cifras WHERE nome_musica = '"+ nome +"'";
        List<Cifras> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Cifras a = new Cifras();
                    a.setCifra(rs.getString(1));
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
    
    public String ExcluirCifra(Cifras a){
        String sql = "DELETE FROM cifras WHERE nome_usuario = ? AND nome_musica = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNomeUsuario());
            ps.setString(2, a.getNomeMusica());
            
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao excluir!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }    
    
    public List<Cifras> ListarCifras(String usuario) {
        String sql = "SELECT id,nome_musica,nome_cantor,tom FROM cifras WHERE nome_usuario = '"+ usuario +"'";
        List<Cifras> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Cifras a = new Cifras();
                    a.setIdCifra(rs.getInt(1));
                    a.setNomeMusica(rs.getString(2));
                    a.setNomeCantor(rs.getString(3));
                    a.setTom(rs.getString(4));
                    
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
    
    public List<Cifras> Pesquisar_Nome_Cifras(String usuario, String pesquisarNome){
        String sql = "SELECT id,nome_musica,nome_cantor,tom FROM cifras "
                + "WHERE nome_usuario = '"+ usuario +"' AND nome_musica LIKE '%"+ pesquisarNome +"%'";
       
        List<Cifras> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Cifras a = new Cifras();
                    a.setIdCifra(rs.getInt(1));
                    a.setNomeMusica(rs.getString(2));
                    a.setNomeCantor(rs.getString(3));
                    a.setTom(rs.getString(4));
                    
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
    
    public List<Cifras> CapturarCifra(int id){
        String sql = "SELECT id,nome_musica,nome_cantor,tom,cifra FROM cifras WHERE id = "+ id + "";
        List<Cifras> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {                    
                    Cifras a = new Cifras();
                    a.setIdCifra(rs.getInt(1));
                    a.setNomeMusica(rs.getString(2));
                    a.setNomeCantor(rs.getString(3));
                    a.setTom(rs.getString(4));
                    a.setCifra(rs.getString(5));
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
    
   public String Alterar_Cifra(Cifras a){
        String sql = "UPDATE cifras SET nome_musica = ?, nome_cantor = ?, tom = ?,"+
                     "cifra = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNomeMusica());
            ps.setString(2, a.getNomeCantor());
            ps.setString(3, a.getTom());
            ps.setString(4, a.getCifra());
            ps.setInt(5, a.getIdCifra());
            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso!";
            } else {
                return "Erro ao atualizar!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }  
}
