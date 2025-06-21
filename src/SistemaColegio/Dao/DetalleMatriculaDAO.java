package SistemaColegio.Dao;

import SistemaColegio.Database.SistemaColegioBD;
import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.DetalleMatricula;
import SistemaColegio.Modelo.Curso;
import SistemaColegio.Modelo.Matricula;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DetalleMatriculaDAO {

    public boolean registrarDetalle(String idMatricula, String idCurso) {
        String sql = "INSERT INTO DetalleMatricula(id_matricula, id_curso) VALUES (?, ?)";
        try {
            Connection con = SistemaColegioBD.getInstancia().getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idMatricula);
            ps.setString(2, idCurso);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("❌ Error al registrar detalle: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        MatriculaDAO mdao = new MatriculaDAO();
        DetalleMatriculaDAO ddao = new DetalleMatriculaDAO();

        String idMatricula = "M010"; // Único
        String periodo = "2025-I";
        String estado = "A";

        if (mdao.registrarMatricula(idMatricula, periodo, estado)) {
            System.out.println("✅ Matrícula registrada");

            // Cursos asociados
            ddao.registrarDetalle(idMatricula, "C001");
            ddao.registrarDetalle(idMatricula, "C002");
        } else {
            System.out.println("❌ Error al registrar matrícula");
        }
    }
}

