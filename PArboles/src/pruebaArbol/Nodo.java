
package pruebaArbol;


public class Nodo {

        private Estudiante estudiante;
        private Nodo siguiente;

        public Nodo(Estudiante estudiante) {
            this.estudiante = estudiante;
            this.siguiente = null;
        }

        public Estudiante getEstudiante() {
            return estudiante;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }


