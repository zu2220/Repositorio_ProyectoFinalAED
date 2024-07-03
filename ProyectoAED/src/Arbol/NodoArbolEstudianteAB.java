
package Arbol;




public class NodoArbolEstudianteAB {
     private EstudianteAB dato;
    private NodoArbolEstudianteAB izquierda;
    private NodoArbolEstudianteAB derecha;

    public NodoArbolEstudianteAB(EstudianteAB dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public NodoArbolEstudianteAB() {
    }
    

    public EstudianteAB getDato() {
        return dato;
    }

    public void setDato(EstudianteAB dato) {
        this.dato = dato;
    }

    public NodoArbolEstudianteAB getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbolEstudianteAB izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbolEstudianteAB getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbolEstudianteAB derecha) {
        this.derecha = derecha;
    }
        
}
