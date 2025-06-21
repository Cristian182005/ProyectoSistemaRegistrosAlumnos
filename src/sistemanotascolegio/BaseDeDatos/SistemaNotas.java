
package sistemanotascolegio.BaseDeDatos;
import java.sql.*;

public class SistemaNotas {

    
    private static final String URL = "jdbc:postgresql://localhost:5432/SistemaNotasBD";
    private static final String USER = "postgres";
    private static final String PASSWORD = " ";

    
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    
    public static void mostrarAlumnoPorDNI(int dni) {
        String sql = "SELECT p.nombre, p.apellido_p, p.apellido_m, p.edad, a.grado, a.seccion, a.id " +
                     "FROM Persona p " +
                     "JOIN Alumno a ON p.id = a.id_persona " +
                     "WHERE p.dni = ?";

        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, dni);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Nombre: " + rs.getString("nombre") + " " + rs.getString("apellido_p") + " " + rs.getString("apellido_m"));
                    System.out.println("Edad: " + rs.getInt("edad"));
                    System.out.println("Grado: " + rs.getInt("grado"));
                    System.out.println("Sección: " + rs.getString("seccion"));
                    System.out.println("ID Alumno: " + rs.getInt("id"));
                } else {
                    System.out.println("Alumno no encontrado con DNI: " + dni);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static void insertarCompetencias(int competencia1, int competencia2, int competencia3, int idAlumno, int idCurso) {
        String sql = "INSERT INTO Competencias (competencia1, competencia2, competencia3, id_alumno, id_curso) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, competencia1);
            ps.setInt(2, competencia2);
            ps.setInt(3, competencia3);
            ps.setInt(4, idAlumno);
            ps.setInt(5, idCurso);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                System.out.println("Competencias insertadas correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static String calcularNotaFinal(int promedio) {
        if (promedio >= 18) return "AD";
        else if (promedio >= 14) return "A";
        else if (promedio >= 11) return "B";
        else return "C";
    }

    
    public static void mostrarPromedioYNotaFinal(int idAlumno, int idCurso) {
        String sql = "SELECT competencia1, competencia2, competencia3 FROM Competencias WHERE id_alumno = ? AND id_curso = ?";

        try (Connection conn = conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ps.setInt(2, idCurso);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int c1 = rs.getInt("competencia1");
                    int c2 = rs.getInt("competencia2");
                    int c3 = rs.getInt("competencia3");

                    int promedio = (c1 + c2 + c3) / 3;
                    String notaFinal = calcularNotaFinal(promedio);

                    System.out.println("Promedio: " + promedio);
                    System.out.println("Nota Final: " + notaFinal);
                } else {
                    System.out.println("No hay competencias registradas para este alumno y curso.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //EJEMPLO
    public static void main(String[] args) {
        int dniBuscar = 87654321;

        mostrarAlumnoPorDNI(dniBuscar);

        insertarCompetencias(18, 16, 19, 1, 1);

        mostrarPromedioYNotaFinal(1, 1);
    }
}
