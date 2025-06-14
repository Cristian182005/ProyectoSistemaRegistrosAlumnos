
package SistemaColegio.Modelo;

public class Alumno extends Persona{
    private String idAlumno;
    private String apoderado;

    public Alumno() {
    }
    
    public Alumno(String idAlumno, String apoderado, int dni, String Nombres, String ApellidoP, String ApellidM, 
            String FechaNacimiento, String Sexo, String direccion, int telefono, String email){
    super(dni, Nombres, ApellidoP, ApellidM, FechaNacimiento, Sexo, direccion, telefono, email);
        this.idAlumno = idAlumno;
        this.apoderado = apoderado;
    }
    
    public void verHorario(){
        
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }
    
}
