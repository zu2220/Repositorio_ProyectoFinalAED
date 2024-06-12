
package ListasEnlazadas;

import Clases.Estudiante;

public class ListaEstudiante {
    
    private NodoEstudiante inicio,fin;
    private int size;
    
    public ListaEstudiante(){
        inicio=null;
        fin=null;
        size=0;
    }
    //insertar al final
    public void insertarAlFinal(Estudiante dato){
        if(inicio==null){
            inicio=fin=new NodoEstudiante(dato);
        } else{
            fin.setSig(new NodoEstudiante(dato));
            fin=fin.getSig();
        }
        size++;
        actualizarPosiciones();
    }
    public void actualizarPosiciones(){
        NodoEstudiante elemento=inicio;
        for(int i=0;i<this.size;i++){
            elemento.setPosicion(i);
            elemento=elemento.getSig();
        }
    }
    //metodo para obtener un nodo al dar su posicion
    public NodoEstudiante getNodoByIndex(int posicion){
        NodoEstudiante elemento=inicio;
        for(int i=0;i<this.size;i++){
            if(elemento.getPosicion()==posicion)
                break;
            elemento=elemento.getSig();
        }
        return elemento;
    }
    

    public NodoEstudiante getInicio() {
        return inicio;
    }

    public NodoEstudiante getFin() {
        return fin;
    }

    public int getSize() {
        return size;
    }
    
    
}
