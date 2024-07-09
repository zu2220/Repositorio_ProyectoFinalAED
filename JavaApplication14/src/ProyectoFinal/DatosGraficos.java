/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Hector
 */
public class DatosGraficos {
    private double Coeficiente[][];
    private int Adyacencia[][];
    private int CordeX[];
    private int CordeY[];
    private String nombre;
    private int EnArbol;
    
    
    
    
    public DatosGraficos(){}

    public DatosGraficos(double[][] Coeficiente, int[][] Adyacencia, int[] CordeX, int[] CordeY, String nombre, int EnArbol) {
        this.Coeficiente = Coeficiente;
        this.Adyacencia = Adyacencia;
        this.CordeX = CordeX;
        this.CordeY = CordeY;
        this.nombre = nombre;
        this.EnArbol = EnArbol;
    }

    public double[][] getCoeficiente() {
        return Coeficiente;
    }

    public void setCoeficiente(double[][] Coeficiente) {
        this.Coeficiente = Coeficiente;
    }

    public int[][] getAdyacencia() {
        return Adyacencia;
    }

    public void setAdyacencia(int[][] Adyacencia) {
        this.Adyacencia = Adyacencia;
    }

    public int[] getCordeX() {
        return CordeX;
    }

    public void setCordeX(int[] CordeX) {
        this.CordeX = CordeX;
    }

    public int[] getCordeY() {
        return CordeY;
    }

    public void setCordeY(int[] CordeY) {
        this.CordeY = CordeY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnArbol() {
        return EnArbol;
    }

    public void setEnArbol(int EnArbol) {
        this.EnArbol = EnArbol;
    }
    
    
    
    
    
    
}
