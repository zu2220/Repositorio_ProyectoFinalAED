/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 *
 * @author Hector
 */
public class EstudianteAB {
    private String nombre;
    private String apellido;
    private int DNI;
    private int Edad;
    
    public EstudianteAB(){}

    public EstudianteAB(String nombre, String apellido, int DNI, int Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.Edad = Edad;
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //Esta guardado
    
}
