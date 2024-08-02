
package arbolesBinariosAV3;

import ClasesProyectoFinalAED.Usuario;


public class Nodo {
    private Usuario dato;
    private Nodo izquierdo;
    private Nodo derecho;
    
    public Nodo(Usuario dato){
        this.dato=dato;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
}
