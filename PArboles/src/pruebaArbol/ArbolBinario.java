/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaArbol;

import javax.swing.JTextArea;

/**
 *
 * @author Hector
 */
public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario() {
    }

    public ArbolBinario(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    public void insertar(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
    if(raiz == null){
        raiz= nuevo;
    }
    else{
        NodoArbol tem= raiz;
        NodoArbol padre= tem;
    
        while(true){
        
        if(dato < tem.getDato()){
            tem= tem.getIzquierda();
        } 
        if(tem == null){
            padre.setIzquierda(nuevo);
            return;
        }
        else{
            tem= tem.getDerecha();
            if(tem == null){
                padre.setDerecha(nuevo);
                return;
            }
        }
        
        
        }
    
    }
}
    
       public void mostrar(JTextArea txtArea, NodoArbol ra){
           NodoArbol aux_raiz= ra;
           NodoArbol aux_izquierda=ra.getIzquierda();
           NodoArbol aux_derecha= ra.getDerecha();
           txtArea.append(String.valueOf(aux_raiz.getDato()));
           txtArea.append("\n");
           //txtArea.append(String.valueOf(aux_raiz.getIzquierda().getDato()));
           
           if(aux_izquierda!= null){
               txtArea.append(String.valueOf(aux_izquierda.getDato()));
              if(aux_izquierda.getIzquierda()!= null){
                mostrar(txtArea, aux_izquierda.getIzquierda()); 
              } else{
                  mostrar(txtArea, aux_derecha);
              }
               
           } 
    
    } 
}
