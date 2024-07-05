/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Hector
 */
public class NodoArbol {
       String nombre;
    String apellido;
    String dni;
    int edad;
    private NodoArbol izquierda;
    private NodoArbol derecha;
    String valor;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(String nombre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.valor = valor;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
   public NodoArbol(){}
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }
    

    public NodoArbol(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.izquierda = null;
        this.derecha = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setvalor(String valor){
     this.valor = "";
    }
    public String getvalor(){
        return valor;
    }
}
