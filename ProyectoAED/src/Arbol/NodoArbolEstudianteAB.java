/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;



/**
 *
 * @author Hector
 */
public class NodoArbolEstudianteAB {
     private EstudianteAB dato;
    private NodoArbolEstudianteAB izquierda;
    private NodoArbolEstudianteAB derecha;

    public NodoArbolEstudianteAB(EstudianteAB dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
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
