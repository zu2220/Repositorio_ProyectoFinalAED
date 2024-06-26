
package ListasEnlazadas;

import Clases.Seccion;


public class ListaAula {
    private NodoAula inicio, fin;
    private int size;
    
    public ListaAula(){
    } 
    public void actualizarPosiciones(){
        NodoAula aux=inicio;
        for(int i=0;i<size;i++){
            aux.setPosicion(i);
            aux=aux.getSig();
        }
    }
    public void insertarAlFinal(Seccion dato){
        if(inicio==null){
            inicio=fin=new NodoAula(dato);
        }else{
            fin.setSig(new NodoAula(dato));
            fin=fin.getSig();
        }
        size++;
        actualizarPosiciones();
    }
    public NodoAula getNodoByIndex(int posicion){
        NodoAula elemento=inicio;
        
        while(elemento.getPosicion()!=posicion){
            elemento=elemento.getSig();
        }
        return elemento;
    }
    public void eliminarNodoEspecifico(int posicion){
        for(int i=0;i<this.size;i++){
            if(this.getNodoByIndex(i).getPosicion()==posicion){
                if(this.getNodoByIndex(i)==inicio){
                    inicio=inicio.getSig();
                }else{
                    this.getNodoByIndex(i-1).setSig(this.getNodoByIndex(i).getSig());
                    this.getNodoByIndex(i).setSig(null);
                }
                break;
            }
        }
        
    }

    public NodoAula getInicio() {
        return inicio;
    }

    public void setInicio(NodoAula inicio) {
        this.inicio = inicio;
    }

    public NodoAula getFin() {
        return fin;
    }

    public void setFin(NodoAula fin) {
        this.fin = fin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Seccion buscarSeccion(String codigo){
        return this.getNodoByIndex(0).buscarNodo(codigo);
    }
}
