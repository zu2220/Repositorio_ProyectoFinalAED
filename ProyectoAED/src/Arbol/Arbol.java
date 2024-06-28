/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hector
 */
public class Arbol {
     private Nodo raiz;
       Nodo izquierda;
     Nodo derecha;
     private String ClavePrimaria;
     

    public Arbol(Nodo raiz, Nodo izquierda, Nodo derecha, String ClavePrimaria) {
        this.raiz = raiz;
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.ClavePrimaria = ClavePrimaria;
    }

    public String getClavePrimaria() {
        return ClavePrimaria;
    }

    public void setClavePrimaria(String ClavePrimaria) {
        this.ClavePrimaria = ClavePrimaria;
    }
     
    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
     
    public Arbol() {
        raiz = raiz;
    }
  public Arbol (Nodo raiz){
  
  }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
       public  void insertar(String nombre, String apellido, String dni, int edad) {
        Nodo nuevoNodo = new Nodo(nombre, apellido, dni, edad);
        if (null == raiz) {
            raiz = nuevoNodo;
        } else {
            insertarRecursivo(raiz, nuevoNodo);
        }
    }

    private void insertarRecursivo(Nodo actual, Nodo nuevoNodo) {
        if (nuevoNodo.getDni().compareTo(actual.getDni()) < 0) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(nuevoNodo);
            } else {
                insertarRecursivo(actual.getIzquierda(), nuevoNodo);
            }
        } else {
            if (actual.getDerecha() == null) {
                actual.setDerecha(nuevoNodo);
            } else {
                insertarRecursivo(actual.getDerecha(), nuevoNodo);
            }
        }
    }

    public void mostrarDatos(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        mostrarDatosRecursivo(raiz, modelo);
    }

    private void mostrarDatosRecursivo(Nodo actual, DefaultTableModel modelo) {
        if (actual != null) {
            modelo.addRow(new Object[]{actual.getNombre(), actual.getApellido(), actual.getDni(), actual.getEdad()});
            mostrarDatosRecursivo(actual.getIzquierda(), modelo);
            mostrarDatosRecursivo(actual.getDerecha(), modelo);
        }
    } 
    
}
