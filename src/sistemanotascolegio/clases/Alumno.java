
package sistemanotascolegio.clases;


public class Alumno extends Persona{
    private int grado;
    private char seccion;

    
  


    
    public Alumno(int dni, String nombre, String Apellido_M, String Apellido_P, int edad, int grado, char seccion, Curso idCurso) {
        super(dni, nombre, Apellido_M, Apellido_P, edad);
        this.grado = grado;
        this.seccion = seccion;
    }
  
    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }
    
    
    
}
