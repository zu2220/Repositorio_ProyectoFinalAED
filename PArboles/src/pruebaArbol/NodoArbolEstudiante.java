
package pruebaArbol;

/**
 *
 * @author Hector
 */
public class NodoArbolEstudiante {

    private Estudiante dato;
    private NodoArbolEstudiante izquierda;
    private NodoArbolEstudiante derecha;

    public NodoArbolEstudiante(Estudiante dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public NodoArbolEstudiante getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbolEstudiante izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbolEstudiante getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbolEstudiante derecha) {
        this.derecha = derecha;
    }
}

