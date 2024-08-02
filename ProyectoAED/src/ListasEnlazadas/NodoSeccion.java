
package ListasEnlazadas;

import ClasesProyectoFinalAED.Seccion;


public class NodoSeccion {
    private Seccion dato;
    private NodoSeccion sig;
    private int posicion;
    
    public NodoSeccion(Seccion dato){
        this.dato=dato;
        sig=null;
    }

    public Seccion getDato() {
        return dato;
    }

    public void setDato(Seccion dato) {
        this.dato = dato;
    }

    public NodoSeccion getSig() {
        return sig;
    }

    public void setSig(NodoSeccion sig) {
        this.sig = sig;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public Seccion buscarNodo(String codigo){
        if(this.getDato().getCodigoSeccion().equalsIgnoreCase(codigo))
            return this.getDato();
        else{
            if(this.getSig()!=null){
                return this.getSig().buscarNodo(codigo);
            }
            else
                return null;
        }
    }
    
}
