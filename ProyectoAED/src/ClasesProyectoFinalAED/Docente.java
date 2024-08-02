
package ClasesProyectoFinalAED;

import ListasEnlazadas.ListaCurso;
import ListasEnlazadas.ListaSeccion;


public class Docente extends Usuario {
    private ListaCurso cursoQueImparte = new ListaCurso();
    private ListaSeccion secciones = new ListaSeccion();
    public Docente() {
    }

    public Docente(String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
    }

    public ListaCurso getCursoQueImparte() {
        return this.cursoQueImparte;
    }

    public void agregarCurso(Curso nuevoCurso) {
        this.cursoQueImparte.insertarAlFinal(nuevoCurso);
    }

    

    public ListaSeccion getSecciones() {
        return this.secciones;
    }

    public void setSecciones(ListaSeccion secciones) {
        this.secciones = secciones;
    }
    
    public void agregarSeccion(Seccion seccion){
        this.secciones.insertarAlInicio(seccion);
    }
    
}
