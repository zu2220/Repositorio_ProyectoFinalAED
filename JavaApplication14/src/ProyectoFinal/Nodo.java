/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Hector
 */
public class Nodo {
    //No le cambiaras el nombre a Nodo Estudiante
    //Ya que evitaras confusiones
       private  int nombre ;
   private boolean visitado ;
   private boolean etiqueta;
   private double acumulado; // lleva el acoulado de cada nodo
   private Nodo Predecesor;
   
   public Nodo(){}

    public Nodo(int nombre, boolean visitado, boolean etiqueta, double acumulado, Nodo Predecesor) {
        this.nombre = nombre;
        this.visitado = visitado;
        this.etiqueta = etiqueta;
        this.acumulado = acumulado;
        this.Predecesor = Predecesor;
    }
   
   
    
    
    
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }

    public Nodo getPredecesor() {
        return Predecesor;
    }

    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }
   
   
    
}
