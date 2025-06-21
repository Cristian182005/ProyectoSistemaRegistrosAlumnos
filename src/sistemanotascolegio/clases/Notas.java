/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanotascolegio.clases;

public class Notas {
    private int Promedio;
    private char NotaFinal;
    private Alumno alumno;
    private Curso curso;

    public Notas(int Promedio, char NotaFinal, Alumno alumno, Curso curso) {
        this.Promedio = Promedio;
        this.NotaFinal = NotaFinal;
        this.alumno = alumno;
        this.curso = curso;
    }

    public int getPromedio() {
        return Promedio;
    }

    public void setPromedio(int Promedio) {
        this.Promedio = Promedio;
    }

    public char getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(char NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
 
    

    
    
    
}
