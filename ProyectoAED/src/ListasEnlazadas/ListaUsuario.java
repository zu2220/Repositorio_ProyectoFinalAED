
package ListasEnlazadas;

import Clases.Usuario;
import Interfaces.IListaEnlazada;


public class ListaUsuario implements IListaEnlazada {
    private int size;
    private NodoUsuario inicio, fin;

    public ListaUsuario(){
        this.inicio=null;
        this.fin=null;
        this.size=0;
    }
    
    @Override
    public void aumentarSize() {
        size++;
    }

    @Override
    public void actualizarPosiciones() {
        NodoUsuario elemento=inicio;
        for(int i=0;i<this.size;i++){
            elemento.setPosicion(i);
            elemento=elemento.getSig();
        }
    }
    
    public NodoUsuario getNodoByIndex(int posicion){
        NodoUsuario elemento=inicio;
        
        while(elemento.getPosicion()!=posicion){
            elemento=elemento.getSig();
        }
        return elemento;
    }
    
    public void insertarAlInicio(Usuario dato){
        inicio=new NodoUsuario(dato,inicio);
        if(fin==null)
            fin=inicio;
        
        aumentarSize();
        actualizarPosiciones();
    }
    
    public void insertarDespuesDe(Usuario dato,int referencia){
        NodoUsuario aux=new NodoUsuario(dato,getNodoByIndex(referencia).getSig());
        getNodoByIndex(referencia).setSig(aux);
        aumentarSize();
        actualizarPosiciones();
    }
    
    public void insertarAlFinal(Usuario dato){
        if(inicio==null)
            inicio=fin=new NodoUsuario(dato);
        else{
            fin.setSig(new NodoUsuario(dato));
            fin=fin.getSig();
        }
        aumentarSize();
        actualizarPosiciones();
    }
    
    public void EliminarIni(){
        NodoUsuario tem=inicio;
        Usuario edato= tem.getDato();
        if(inicio== null){
        inicio= null;
        fin= null;
        }
        else{
        inicio= tem.getSig();
        }
        size--;
        actualizarPosiciones();
    }
    public void EliminarAlMedio(int referencia){
        NodoUsuario eliminar=getNodoByIndex(referencia);
        NodoUsuario aux=getNodoByIndex(referencia-1);
        aux.setSig(eliminar.getSig());
        eliminar.setSig(null);
        size--;
        actualizarPosiciones();
    }
    
    public void EliminarFin(){
         if (inicio == null) {
        return;
        }

        if (inicio == fin) {
        inicio = null;
        fin = null;
        } else {
        NodoUsuario actual = inicio;
        while (actual.getSig() != fin) {
            actual = actual.getSig();
        }
        actual.setSig(null);
        fin = actual;
        }
        size--;
        actualizarPosiciones();
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoUsuario getInicio() {
        return inicio;
    }

    public void setInicio(NodoUsuario inicio) {
        this.inicio = inicio;
    }

    public NodoUsuario getFin() {
        return fin;
    }

    public void setFin(NodoUsuario fin) {
        this.fin = fin;
    }
    
}
