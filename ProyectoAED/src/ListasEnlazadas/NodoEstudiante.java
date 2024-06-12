
package ListasEnlazadas;

import Clases.Estudiante;


public class NodoEstudiante {
    private Estudiante dato;
    private NodoEstudiante sig;
    private int posicion;
    
    public NodoEstudiante(Estudiante dato){
        this.dato=dato;
        this.sig=null;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public NodoEstudiante getSig() {
        return sig;
    }

    public void setSig(NodoEstudiante sig) {
        this.sig = sig;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
}
