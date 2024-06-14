
package pruebaArbol;

public class TablaHash {
    private int tamaño;
    private Nodo[] tabla;

    public TablaHash(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new Nodo[tamaño];
    }

    public void insertar(Estudiante estudiante) {
        Usuario auxUsuario= (Usuario) estudiante;
        int indice = hash(Integer.parseInt(auxUsuario.getDNI()));
        if (tabla[indice] == null) {
            tabla[indice] = new Nodo(estudiante);
        } else {
            Nodo nodo = tabla[indice];
            while (nodo.getSiguiente()!= null) {
                nodo = nodo.getSiguiente();
            }
            nodo.setSiguiente(new Nodo(estudiante));
        }
    }

    public Estudiante buscar(int dni) {
        //Usuario auxUs=(Usuario)
        int indice = hash(dni);
        Nodo nodo = tabla[indice];
        while (nodo!= null) {
            
            if (Integer.parseInt(nodo.getEstudiante().getDNI())==dni) {
                return nodo.getEstudiante();
            }
            nodo = nodo.getSiguiente();
        }
        return null;
    }

    public int hash(int clave) {
        return clave % tamaño;
    }

}
