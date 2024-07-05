/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Hector
 */
public class Nodo {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
     Nodo izquierda;
     Nodo derecha;
    public Nodo(String nombre1, String apellido1, String dni1, int edad1){
    
    }

    public Nodo(String nombre, String apellido, String dni, int edad, Nodo izquierda, Nodo derecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    String getClavePrimaria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
