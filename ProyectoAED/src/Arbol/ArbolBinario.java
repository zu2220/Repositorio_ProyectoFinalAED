
package Arbol;

public class ArbolBinario {
        private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    
}

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
   
     // Método para insertar un nodo en el árbol
    public  void insertar(Nodo nodo) {
        if (raiz == null) {
            raiz = nodo;
        } else {
            insertarRecursivo(raiz, nodo);
        }
    }

    // Método recursivo para insertar un nodo en el árbol
    public void insertarRecursivo(Nodo actual, Nodo nodo) {
        if (nodo.getEdad() < actual.getEdad()) {
            if (actual.izquierda == null) {
                actual.izquierda = nodo;
            } else {
                insertarRecursivo(actual.izquierda, nodo);
            }
        } else {
            if (actual.derecha == null) {
                actual.derecha = nodo;
            } else {
                insertarRecursivo(actual.derecha, nodo);
                
            }
        }
}
}