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
}
