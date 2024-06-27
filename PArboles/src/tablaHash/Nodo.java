
package tablaHash;

import tablaHash.EstudianteTH;


public class Nodo {

        private EstudianteTH estudiante;
        private Nodo siguiente;

        public Nodo(EstudianteTH estudiante) {
            this.estudiante = estudiante;
            this.siguiente = null;
        }

        public EstudianteTH getEstudiante() {
            return estudiante;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }


