package pruebaArbol;



public class ArbolEstudiante {
    
    private NodoArbolEstudiante raiz;
    private int size;

    public ArbolEstudiante() {
        raiz = null;
        size = 0;
    }

    // Método para insertar un nodo en el árbol
    public void insertarNodo(Estudiante dato) {
        if (raiz == null) {
            raiz = new NodoArbolEstudiante(dato);
        } else {
            insertar(raiz, dato);
        }
        size++;
    }

    // Método auxiliar para la inserción de un nodo
    private void insertar(NodoArbolEstudiante nodo, Estudiante dato) {
        if (dato.getEdad()< nodo.getDato().getEdad()) {
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new NodoArbolEstudiante(dato));
            } else {
                insertar(nodo.getIzquierda(), dato);
            }
        } else if (dato.getEdad()>nodo.getDato().getEdad()) {
            if (nodo.getDerecha() == null) {
                nodo.setDerecha(new NodoArbolEstudiante(dato));
            } else {
                insertar(nodo.getDerecha(), dato);
            }
        }
    }

    // Método para recorrer el árbol en preorden
    public void recorrerPreorden() {
        recorrerPreorden(raiz);
    }

    private void recorrerPreorden(NodoArbolEstudiante nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + "\n ");
            recorrerPreorden(nodo.getIzquierda());
            recorrerPreorden(nodo.getDerecha());
        }
    }

    // Método para recorrer el árbol en inorden
    public void recorrerInorden() {
        recorrerInorden(raiz);
    }

    private void recorrerInorden(NodoArbolEstudiante nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.getIzquierda());
            System.out.print(nodo.getDato() + " ");
            recorrerInorden(nodo.getDerecha());
        }
    }

    // Método para recorrer el árbol en postorden
    public void recorrerPostorden() {
        recorrerPostorden(raiz);
    }

    private void recorrerPostorden(NodoArbolEstudiante nodo) {
        if (nodo != null) {
            recorrerPostorden(nodo.getIzquierda());
            recorrerPostorden(nodo.getDerecha());
            System.out.print(nodo.getDato() + " ");
        }
    }

    // Método para buscar un nodo en el árbol
    public NodoArbolEstudiante buscarNodo(Estudiante dato) {
        return buscarNodo(raiz, dato);
    }

    private NodoArbolEstudiante buscarNodo(NodoArbolEstudiante nodo, Estudiante dato) {
        if (nodo == null || nodo.getDato().equals(dato)) {
            return nodo;
        }
        if (dato.getEdad() < 0) {
            return buscarNodo(nodo.getIzquierda(), dato);
        } else {
            return buscarNodo(nodo.getDerecha(), dato);
        }
    }

    // Método para eliminar un nodo del árbol
    public void eliminarNodo(Estudiante dato) {
        raiz = eliminarNodo(raiz, dato);
        size--;
    }

    private NodoArbolEstudiante eliminarNodo(NodoArbolEstudiante nodo, Estudiante dato) {
        if (nodo == null) {
            return null;
        }
        if (dato.getEdad()<(nodo.getDato().getEdad())) {
            nodo.setIzquierda(eliminarNodo(nodo.getIzquierda(), dato));
        } else if (dato.getEdad()==(nodo.getDato().getEdad())) {
            nodo.setDerecha(eliminarNodo(nodo.getDerecha(), dato));
        } else {
            // Nodo con un solo hijo o sin hijos
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            } else {
                // Nodo con dos hijos: obtener el sucesor en inorden (menor de la subárbol derecho)
                NodoArbolEstudiante minimo = encontrarMinimo(nodo.getDerecha());
                nodo.setDato(minimo.getDato());
                nodo.setDerecha(eliminarNodo(nodo.getDerecha(), minimo.getDato()));
            }
        }
        return nodo;
    }

    // Método auxiliar para encontrar el nodo con el valor mínimo
    private NodoArbolEstudiante encontrarMinimo(NodoArbolEstudiante nodo) {
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }

    // Método para obtener el tamaño del árbol
    public int getSize() {
        return size;
    }

    // Método para verificar si el árbol está vacío
    public boolean isEmpty() {
        return size == 0;
    }
    
      
    public void insertar_preorden(Estudiante dato){
        NodoArbolEstudiante nuevo = new NodoArbolEstudiante(dato);
        if(raiz == null){
            raiz= nuevo;     
        } else{
            NodoArbolEstudiante tem= raiz;
            NodoArbolEstudiante padre;
              while(true){
                padre= tem;
                if(nuevo.getDato().getEdad()< tem.getDato().getEdad()){
                    tem= tem.getIzquierda();
                    if( tem == null){
                        padre.setIzquierda(nuevo);
                        return;
                    
                    } else{
                        tem= tem.getDerecha();
                        if(tem == null){
                            padre.setDerecha(nuevo);
                            return;
                        
                        }
                    }
                
                
                }
            
            
            }
        }
          
    }
    
}