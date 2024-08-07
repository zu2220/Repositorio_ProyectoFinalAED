
package ClasesProyectoFinalAED;

import ListasEnlazadas.ListaEstudiante;


public class Seccion {
    private String codigoSeccion;
    private Curso curso;
    private Docente docenteACargo;
    private int Size;

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }
    
    
    private String[] horario=new String[6];

    private ListaEstudiante LE;

    public Seccion() {
    }
    public Seccion(String codigoSeccion, Curso curso,Docente docenteACargo){
        this.codigoSeccion=codigoSeccion;
        this.curso=curso;
        this.docenteACargo=docenteACargo;
        
    }

    public String getCodigoSeccion() {
        return codigoSeccion;
    }

    public void setCodigoSeccion(String codigoSeccion) {
        this.codigoSeccion = codigoSeccion;
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
