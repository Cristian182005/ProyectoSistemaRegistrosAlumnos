/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaColegio.Modelo;

/**
 *
 * @author Administrador
 */
public abstract class PersonaUsuario {
    protected int dni;
    protected String Nombres;
    protected String ApellidoP;
    protected String ApellidM;
    protected String FechaNacimiento;
    protected String Sexo;
    protected String direccion;
    protected int telefono;
    protected String email;
    protected String usuario;
    protected String contrasena;

    public PersonaUsuario() {
    }

    public PersonaUsuario(int dni, String Nombres, String ApellidoP, String ApellidM, String FechaNacimiento, 
            String Sexo, String direccion, int telefono, String email, String usuario, String contrasena)
    {
        this.dni = dni;
        this.Nombres = Nombres;
        this.ApellidoP = ApellidoP;
        this.ApellidM = ApellidM;
        this.FechaNacimiento = FechaNacimiento;
        this.Sexo = Sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidM() {
        return ApellidM;
    }

    public void setApellidM(String ApellidM) {
        this.ApellidM = ApellidM;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
