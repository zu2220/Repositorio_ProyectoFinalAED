
package Clases;

import ListasEnlazadas.ListaAula;


public class Docente extends Usuario {
    private Curso cursoQueImparte;
    private ListaAula aulas;
    public Docente() {
    }

    public Docente(String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
    }

    public Curso getCursoQueImparte() {
        return cursoQueImparte;
    }

    public void setCursoQueImparte(Curso cursoQueImparte) {
        this.cursoQueImparte = cursoQueImparte;
    }

    

    public ListaAula getAulas() {
        return aulas;
    }

    public void setAulas(ListaAula aulas) {
        this.aulas = aulas;
    }
    
    
    
}
