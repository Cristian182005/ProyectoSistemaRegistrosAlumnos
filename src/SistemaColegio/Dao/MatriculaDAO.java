package SistemaColegio.Dao;

import SistemaColegio.Database.SistemaColegioBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatriculaDAO {

    public boolean registrarMatricula(String idMatricula, String periodo, String estado) {
        String sql = "INSERT INTO Matricula(idMatricula, periodoAcademico, fecha, estado) VALUES (?, ?, ?, ?)";
        try {
            Connection con = SistemaColegioBD.getInstancia().getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idMatricula);
            ps.setString(2, periodo);

            // Fecha actual
            String fechaActual = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            ps.setString(3, fechaActual);
            ps.setString(4, estado);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("❌ Error al registrar matrícula: " + e.getMessage());
            return false;
        }
    }
}

