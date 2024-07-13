/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;
import Formulario.frmInicio;
/**
 *
 * @author Hector
 */
public class AlgoritmoDijkstra {

    public AlgoritmoDijkstra(ProyectoFinal.Nodo[] nodo, ProyectoFinal.DatosGraficos Arboles, int tope, int nodofinal) {
        this.tope= tope;
        this.nodo = nodo;
        this.Arboles= Arboles;
        this.nodofinal= nodofinal;
    }
    
   private final DatosGraficos Arboles;
   private int subtope; 
   private Nodo nodoauxiliar= null;
   private double auxiliarAcumulado;
   private double subtotalAcumulado;
   private final Nodo nodo[];
   private final int tope;
   private final int nodofinal;
   private int Origen;
  private javax.swing.JPanel jPanel;
    public int getSubtope() {
        return subtope;
    }

    public void setSubtope(int subtope) {
        this.subtope = subtope;
    }

    public Nodo getNodoauxiliar() {
        return nodoauxiliar;
    }

    public void setNodoauxiliar(Nodo nodoauxiliar) {
        this.nodoauxiliar = nodoauxiliar;
    }

    public double getAuxiliarAcumulado() {
        return auxiliarAcumulado;
    }

    public void setAuxiliarAcumulado(double auxiliarAcumulado) {
        this.auxiliarAcumulado = auxiliarAcumulado;
    }

    public double getSubtotalAcumulado() {
        return subtotalAcumulado;
    }

    public void setSubtotalAcumulado(double subtotalAcumulado) {
        this.subtotalAcumulado = subtotalAcumulado;
    }

    public int getOrigen() {
        return Origen;
    }

    public void setOrigen(int Origen) {
        this.Origen = Origen;
    }
   
    public void dijkstra(){
        for(int i=0; i< tope; i++){
            nodo[1]= new Nodo();
           //  jPanel.paint(jPanel.getGraphics());
        }
    
        
    }
 
    
   
    
    
    
}
