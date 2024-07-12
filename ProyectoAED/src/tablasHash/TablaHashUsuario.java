/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasHash;
import Clases.Usuario;
/**
 *
 * @author Hector
 */
public class TablaHashUsuario {
    private Usuario[] THUsuario;
    private int size;
    
    public int getSize() {
        return size;
    }
    
    
    public TablaHashUsuario(){
        
    }

    public Usuario[] getTHUsuario() {
        return THUsuario;
    }

    public void setTHUsuario(Usuario[] THUsuario) {
       this.THUsuario = THUsuario;
    
    }
    
    public void setSize(int size){
        this.THUsuario= new Usuario[size];
        this.size= size;
    }
    public int AritmeticaModular(int clave ){
        int aux= (int) clave%size;
        
        return aux;
    }
   
    public void Insertar(Usuario aux ){
       int clave= AritmeticaModular(aux.getId());
        if(THUsuario[clave]== null){
            THUsuario[clave]= aux;
        } 
        else{
            clave ++;
            while(THUsuario[clave]!= null){
                
                clave ++;
                
            } 
            THUsuario[clave] = aux;
            aux.setId(clave);
            
        }
        
    }
        
    
}

