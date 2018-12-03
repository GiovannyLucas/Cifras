package DAO;

import Models.Cifras;
import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CifrasDAO extends ExecuteSQL {

    public CifrasDAO(Connection con) {
        super(con);
    }
    
    public String Cadastro_Cifra(Cifras a) {
        String sql = "INSERT INTO cifras VALUES (0,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setInt(1, a.getIdUsuario());
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
   
}
