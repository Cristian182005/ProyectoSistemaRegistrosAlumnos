/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanotascolegio.clases;

public class Curso  {
    private int idCurso;
    private String nombreCurso;
    private Competencias competencias;
    public Curso(int idCurso, String nombreCurso, Competencias competencias) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.competencias = competencias;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Competencias getCompetencias() {
        return competencias;
    }

    public void setCompetencias(Competencias competencias) {
        this.competencias = competencias;
    }
    
    
}
