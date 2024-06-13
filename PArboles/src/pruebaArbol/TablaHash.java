/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaArbol;

/**
 *
 * @author Hector
 */
public class TablaHash {
    private int tamaño;
    private Nodo[] tabla;

    public TablaHash(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new Nodo[tamaño];
    }

    public void insertar(Estudiante estudiante) {
        Usuario auxUsuario= (Usuario) estudiante;
        int indice = hash(Integer.parseInt(auxUsuario.getDNI()));
        if (tabla[indice] == null) {
            tabla[indice] = new Nodo(estudiante);
        } else {
            Nodo nodo = tabla[indice];
            while (nodo.getSiguiente()!= null) {
                nodo = nodo.getSiguiente();
            }
            nodo.setSiguiente(new Nodo(estudiante));
        }
    }

    public Estudiante buscar(int dni) {
        int indice = hash(dni);
        Nodo nodo = tabla[indice];
        while (nodo!= null) {
            
            if (nodo.getEstudiante().getDni() == dni) {
                return nodo.getEstudiante();
            }
            nodo = nodo.getSiguiente();
        }
        return null;
    }

    private int hash(int clave) {
        return clave % tamaño;
    }

    private class Nodo {
        private Estudiante estudiante;
        private Nodo siguiente;

        public Nodo(Estudiante estudiante) {
            this.estudiante = estudiante;
            this.siguiente = null;
        }

        public Estudiante getEstudiante() {
            return estudiante;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
}
