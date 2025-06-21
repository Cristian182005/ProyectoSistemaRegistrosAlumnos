
package sistemanotascolegio.clases;

public class Persona {
    private int dni;
    private String nombre; 
    private String ApellidoM;
    private String ApellidoP;
    private int edad; 

    public Persona(int dni, String nombre, String ApellidoM, String ApellidoP, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.ApellidoM = ApellidoM;
        this.ApellidoP = ApellidoP;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_M() {
        return ApellidoM;
    }

    public void setApellido_M(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getApellido_P() {
        return ApellidoP;
    }

    public void setApellido_P(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
}
