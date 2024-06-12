
package ListasEnlazadas;

import Clases.Docente;


public class NodoDocente {
    private Docente dato;
    private NodoDocente sig;
    private int posicion;
    
    public NodoDocente(Docente dato){
        this.dato=dato;
        sig=null;
    }

    public Docente getDato() {
        return dato;
    }

    public void setDato(Docente dato) {
        this.dato = dato;
    }

    public NodoDocente getSig() {
        return sig;
    }

    public void setSig(NodoDocente sig) {
        this.sig = sig;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public Docente buscarDocente(String NombreDocente){
        if(this.dato.getNombre().equalsIgnoreCase(NombreDocente)){
            return this.getDato();
        }else if(this.getSig()!=null){
            return this.getSig().buscarDocente(NombreDocente);
        }else{
            return null;
        }
    }
}
