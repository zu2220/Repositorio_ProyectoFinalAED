
package ListasEnlazadas;

import Clases.Curso;


public class ListaCurso {
    private NodoCurso inicio, fin;
    private int size;
    
    public ListaCurso(){
    }
    public void actualizarPosiciones(){
        NodoCurso aux=inicio;
        for(int i=0;i<size;i++){
            aux.setPosicion(i);
            aux=aux.getSig();
        }
    }
    public void insertarAlFinal(Curso dato){
        if(inicio==null){
            inicio=fin=new NodoCurso(dato);
        }else{
            fin.setSig(new NodoCurso(dato));
            fin=fin.getSig();
        }
        size++;
        actualizarPosiciones();
    }
    public NodoCurso getNodoByIndex(int posicion){
        NodoCurso elemento=inicio;
        
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

    public NodoCurso getInicio() {
        return inicio;
    }

    public void setInicio(NodoCurso inicio) {
        this.inicio = inicio;
    }

    public NodoCurso getFin() {
        return fin;
    }

    public void setFin(NodoCurso fin) {
        this.fin = fin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
