
package Clases;

import ListasEnlazadas.ListaEstudiante;


public class Seccion {
    private String codigoAula;
    private Curso curso;
    private Docente docenteACargo;
    private String[] horario=new String[6];
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

    public String getHorario(int i) {
        return this.horario[i];
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

   public void insertarHDia(String hora,int p){
       this.horario[p]=hora;
   }
    
    
}
