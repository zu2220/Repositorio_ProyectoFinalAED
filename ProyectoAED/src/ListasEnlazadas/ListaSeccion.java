
package ListasEnlazadas;

import Clases.Seccion;


public class ListaSeccion {
    private NodoSeccion inicio, fin;
    private int size;
    
    public ListaSeccion(){
    } 
    public void actualizarPosiciones(){
        NodoSeccion aux=inicio;
        for(int i=0;i<size;i++){
            aux.setPosicion(i);
            aux=aux.getSig();
        }
    }
    public void insertarAlFinal(Seccion dato){
        if(inicio==null){
            inicio=fin=new NodoSeccion(dato);
        }else{
            fin.setSig(new NodoSeccion(dato));
            fin=fin.getSig();
        }
        size++;
        actualizarPosiciones();
    }
    public NodoSeccion getNodoByIndex(int posicion){
        NodoSeccion elemento=inicio;
        
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

    public NodoSeccion getInicio() {
        return inicio;
    }

    public void setInicio(NodoSeccion inicio) {
        this.inicio = inicio;
    }

    public NodoSeccion getFin() {
        return fin;
    }

    public void setFin(NodoSeccion fin) {
        this.fin = fin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
