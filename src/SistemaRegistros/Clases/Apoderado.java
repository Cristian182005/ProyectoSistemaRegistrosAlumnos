
package SistemaRegistros.Clases;

public class Apoderado {
    private String idApoderado;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String estadoCivil;
    private char estado;

    public Apoderado() {
    }
    
    public Apoderado(String idApoderado, String nombres, String apellidos, String telefono,
                     String direccion, String estadoCivil, char estado) {
        this.idApoderado = idApoderado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.estado = estado;
    }

    public String getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(String idApoderado) {
        this.idApoderado = idApoderado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
