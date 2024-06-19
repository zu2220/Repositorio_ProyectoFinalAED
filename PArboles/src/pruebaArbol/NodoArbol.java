/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaArbol;

/**
 *
 * @author Hector
 */
public class NodoArbol {
    private int dato;
    private NodoArbol izquierda;
    private NodoArbol derecha;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
    public NodoArbol(){
    
    
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }
    
    
    
}
