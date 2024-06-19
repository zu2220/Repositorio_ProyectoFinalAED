
package Clases;

import ListasEnlazadas.ListaCurso;
import ListasEnlazadas.ListaSeccion;


public class Docente extends Usuario {
    private ListaCurso cursoQueImparte;
    private ListaSeccion secciones;
    public Docente() {
    }

    public Docente(String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
    }

    public ListaCurso getCursoQueImparte() {
        return cursoQueImparte;
    }

    public void agregarCurso(Curso nuevoCurso) {
        cursoQueImparte.insertarAlFinal(nuevoCurso);
    }

    

    public ListaSeccion getSecciones() {
        return secciones;
    }

    public void setSecciones(ListaSeccion secciones) {
        this.secciones = secciones;
    }
    
    
    
}
