
package tablaHash;

import tablaHash.Estudiante;

public class TablaHash {
    private int tamaño;
    private Nodo[] tabla;

    public TablaHash(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new Nodo[tamaño];
    }

    public void insertar(Estudiante estudiante) {
        //Usuario auxUsuario= (Usuario) estudiante;
       // String nombre= "";
        int indice = hash(estudiante.getCodigo());
        if (tabla[indice] == null) {
            tabla[indice] = new Nodo(estudiante);
        } else {
           /* Nodo nodo = tabla[indice];
            while (nodo.getSiguiente()!= null) {
                nodo = nodo.getSiguiente();
            }*/
            //nodo.setSiguiente(new Nodo(estudiante));
            for(int i= indice+1; i<= tamaño; i++){
                if(tabla[i]== null){
                    tabla[i]= new Nodo(estudiante);
                    break;
                }
                
            }
        }
    }

    public Estudiante buscar(int codigo) {
        //Usuario auxUs=(Usuario)
        int indice = hash(codigo);
        Nodo nodo = tabla[indice];
        while (nodo!= null) {
            
            if (nodo.getEstudiante().getCodigo()==codigo) {
                return nodo.getEstudiante();
            }
            nodo = nodo.getSiguiente();
        }
        return null;
    }

    public int hash(int clave) {
        return clave % tamaño;
    }
    public Nodo[] getTabla (){
     return tabla;
    }
    
}
