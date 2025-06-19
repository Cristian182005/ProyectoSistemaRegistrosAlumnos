package SistemaColegio.Modelo;

import SistemaColegio.Interfaces.Asistencia;
import SistemaColegio.Interfaces.IMatricula;

public class Admin extends PersonaUsuario implements Asistencia, IMatricula {

    private int idAdmin;

    public Admin() {
    }

    public Admin(int dni, String Nombres, String ApellidoP, String ApellidM, String FechaNacimiento, String Sexo, String direccion, 
            int telefono, String email, String usuario, String contrasena) {
        super(dni, Nombres, ApellidoP, ApellidM, FechaNacimiento, Sexo, direccion, telefono, email, usuario, contrasena);
    }


   
    
    //Interface Asistencia
    @Override
    public void registrarAsistencia() {

    }

    @Override
    public void reporteAsistencia() {

    }
    
    //Interface Matricula
    @Override
    public void gestionarMatricula() {
        
    }

    @Override
    public void ReporteMatricula() {
        
    }
    
    //Metodos get y set
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

 

}
