
package Clases;

import ListasEnlazadas.ListaEstudiante;


public class Seccion {
    private String codigoAula;
    private Curso curso;
    private Docente docenteACargo;
    private int[][] matrizHorario=new int[1][6];
    private ListaEstudiante LE;

    public Seccion() {
    }
    public Seccion(String codigoAula, Curso curso,Docente docenteACargo){
        this.codigoAula=codigoAula;
        this.curso=curso;
        this.docenteACargo=docenteACargo;
        
    }

    public String getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(String codigoAula) {
        this.codigoAula = codigoAula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Docente getDocenteACargo() {
        return docenteACargo;
    }

    public void setDocenteACargo(Docente docenteACargo) {
        this.docenteACargo = docenteACargo;
    }

    public ListaEstudiante getLE() {
        return LE;
    }

    public void setLE(ListaEstudiante LE) {
        this.LE = LE;
    }

    public int[][] getMatrizHorario() {
        return matrizHorario;
    }

    public void setMatrizHorario(int[][] matrizHorario) {
        this.matrizHorario = matrizHorario;
    }
    
    
    
}
