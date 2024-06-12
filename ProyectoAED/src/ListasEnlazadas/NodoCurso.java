
package ListasEnlazadas;

import Clases.Curso;


public class NodoCurso {
    private Curso dato;
    private NodoCurso sig;
    private int posicion;
    
    public NodoCurso(Curso dato){
        this.dato=dato;
        sig=null;
    }

    public Curso getDato() {
        return dato;
    }

    public void setDato(Curso dato) {
        this.dato = dato;
    }

    public NodoCurso getSig() {
        return sig;
    }

    public void setSig(NodoCurso sig) {
        this.sig = sig;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public Curso buscarCurso(String nombreCurso){
        if(this.dato.getNombreCurso().equalsIgnoreCase(nombreCurso)){
            return this.dato;
        }else if(this.sig!=null){
                    return this.sig.buscarCurso(nombreCurso);
              } else{
                    return null;
                }
            
    }
    }
    

