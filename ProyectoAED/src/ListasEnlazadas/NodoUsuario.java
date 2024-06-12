
package ListasEnlazadas;

import Clases.Usuario;


public class NodoUsuario {
    private Usuario dato;
    private NodoUsuario sig;
    private int posicion;
    
    public NodoUsuario(){
    
    }
    public NodoUsuario(Usuario dato, NodoUsuario sig){
        this.dato=dato;
        this.sig=sig;
    }
    public NodoUsuario(Usuario dato){
        this.dato=dato;
        this.sig=null;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsuario getSig() {
        return sig;
    }

    public void setSig(NodoUsuario sig) {
        this.sig = sig;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
