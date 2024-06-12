
package ListasEnlazadas;

import Clases.Seccion;


public class NodoAula {
    private Seccion dato;
    private NodoAula sig;
    private int posicion;
    
    public NodoAula(Seccion dato){
        this.dato=dato;
        sig=null;
    }

    public Seccion getDato() {
        return dato;
    }

    public void setDato(Seccion dato) {
        this.dato = dato;
    }

    public NodoAula getSig() {
        return sig;
    }

    public void setSig(NodoAula sig) {
        this.sig = sig;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
