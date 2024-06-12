
package ListasEnlazadas;

import Clases.Docente;


public class ListaDocente {
    private NodoDocente inicio, fin;
    private int size;
    
    public ListaDocente(){
    } 
    public void actualizarPosiciones(){
        NodoDocente aux=inicio;
        for(int i=0;i<size;i++){
            aux.setPosicion(i);
            aux=aux.getSig();
        }
    }
    public void insertarAlFinal(Docente dato){
        if(inicio==null){
            inicio=fin=new NodoDocente(dato);
        }else{
            fin.setSig(new NodoDocente(dato));
            fin=fin.getSig();
        }
        size++;
        actualizarPosiciones();
    }
    public NodoDocente getNodoByIndex(int posicion){
        NodoDocente elemento=inicio;
        
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
    public boolean isListaDocenteEmpty(){
        boolean flag=false;
        if(inicio==null){
            flag=true;
        }
        return flag;
    }

    public NodoDocente getInicio() {
        return inicio;
    }

    public void setInicio(NodoDocente inicio) {
        this.inicio = inicio;
    }

    public NodoDocente getFin() {
        return fin;
    }

    public void setFin(NodoDocente fin) {
        this.fin = fin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
