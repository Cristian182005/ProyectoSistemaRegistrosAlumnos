package SistemaRegistros.Clases;

import SistemaRegistros.Interfaces.Asistencia;
import SistemaRegistros.Interfaces.Matricula;

public class Admin implements Asistencia, Matricula {

    private String idAdmin;
    private String usuario;
    private String contraseña;

    public Admin() {
    }

    public Admin(String idAdmin, String usuario, String contraseña) {
        this.idAdmin = idAdmin;
        this.usuario = usuario;
        this.contraseña = contraseña;
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
    public void reporteMatricula() {
        
    }
    
    //Metodos get y set
    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
