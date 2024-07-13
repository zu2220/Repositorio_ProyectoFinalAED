
package arbolesBinariosAV3;

import Clases.*;
import javax.swing.table.DefaultTableModel;


public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void insertar(Usuario dato){
        Nodo aux=new Nodo(dato);
        if(raiz==null){
            raiz=aux;
        }else{
            Nodo tem=aux;
            Nodo padre=null;
            
            while(tem!=null){
                padre=tem;
                if(dato.getId()<tem.getDato().getId()){
                    tem=tem.getIzquierdo();
                    if(tem==null){
                        padre.setIzquierdo(aux);
                        return;
                    }
                }
                else{
                    tem=tem.getDerecho();
                    if(tem==null){
                        padre.setDerecho(aux);
                        return;
                    }
                }
            }
        }
    }
    
    public void preOrden(Nodo nodo,DefaultTableModel dtm){
        if(nodo!=null){
        Object[] o=new Object[8];
        o[0]=nodo.getDato().getId();
        o[1]=nodo.getDato().getTipoUsuario();
        o[2]=null;
        if(nodo.getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
            Estudiante auxE=(Estudiante)nodo.getDato();
            o[2]=auxE.getNumOrden();
        }
        o[3]=nodo.getDato().getDNI();
        o[4]=nodo.getDato().getNombre();
        o[5]=nodo.getDato().getApellido();
        o[6]=nodo.getDato().getEmail();
        o[7]=nodo.getDato().getContrasena();
        dtm.addRow(o);
        preOrden(nodo.getIzquierdo(),dtm);
        preOrden(nodo.getDerecho(),dtm);
        }     
        
    }
    
    public void inOrden(Nodo nodo,DefaultTableModel dtm){
        if(nodo!=null){
        inOrden(nodo.getIzquierdo(),dtm);
        Object[] o=new Object[8];
        o[0]=nodo.getDato().getId();
        o[1]=nodo.getDato().getTipoUsuario();
        o[2]=null;
        if(nodo.getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
            Estudiante auxE=(Estudiante)nodo.getDato();
            o[2]=auxE.getNumOrden();
        }
        o[3]=nodo.getDato().getDNI();
        o[4]=nodo.getDato().getNombre();
        o[5]=nodo.getDato().getApellido();
        o[6]=nodo.getDato().getEmail();
        o[7]=nodo.getDato().getContrasena();
        dtm.addRow(o);
        
        inOrden(nodo.getDerecho(),dtm);
        }  
    }
    
    public void postOrden(Nodo nodo,DefaultTableModel dtm){
        if(nodo!=null){
        postOrden(nodo.getIzquierdo(),dtm);
        postOrden(nodo.getDerecho(),dtm);
        Object[] o=new Object[8];
        o[0]=nodo.getDato().getId();
        o[1]=nodo.getDato().getTipoUsuario();
        o[2]=null;
        if(nodo.getDato().getTipoUsuario().equalsIgnoreCase("Estudiante")){
            Estudiante auxE=(Estudiante)nodo.getDato();
            o[2]=auxE.getNumOrden();
        }
        o[3]=nodo.getDato().getDNI();
        o[4]=nodo.getDato().getNombre();
        o[5]=nodo.getDato().getApellido();
        o[6]=nodo.getDato().getEmail();
        o[7]=nodo.getDato().getContrasena();
        dtm.addRow(o);
        
        }
    }
    
    public Nodo buscar(int id){
        Nodo tem=raiz;
        while(raiz.getDato().getId()!=id){
            if(id<tem.getDato().getId())
                tem=tem.getIzquierdo();
            else{
                tem=tem.getDerecho();
            }
            if(tem==null)
                return null;
        }
        return tem;
    }
    
    public void eliminar(int id){
        
    }
    
}
