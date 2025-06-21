package SistemaColegio.Modelo;

import SistemaColegio.Interfaces.Asistencia;

public class Docente extends PersonaUsuario implements Asistencia {

    private String idProfesor;
    private String titulo;
    private String fechaContrato;

    public Docente() {
    }

    public Docente(int dni, String Nombres, String ApellidoP, String ApellidM, String FechaNacimiento, 
            String Sexo, String direccion, int telefono, String email, String usuario, String contrasena) {
        super(dni, Nombres, ApellidoP, ApellidM, FechaNacimiento, Sexo, direccion, telefono, email, usuario, contrasena);
    }

   

    
    public void asignarNotas() {

    }

    public void reporteAcademico() {

    }

    @Override
    public void registrarAsistencia() {
        
    }

    @Override
    public void reporteAsistencia() {
        
    }

    //Metodos get y set
    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

}
