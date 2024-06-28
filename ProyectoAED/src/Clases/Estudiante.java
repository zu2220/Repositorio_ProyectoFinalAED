
package Clases;

import ListasEnlazadas.ListaAula;

public class Estudiante extends Usuario {
    private String NumOrden;
    private ListaAula seccionesE;
    

    public Estudiante(String NumOrden) {
        this.NumOrden = NumOrden;
    }

    public Estudiante(String NumOrden, String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
        this.NumOrden = NumOrden;
    }

    public Estudiante() {
    }

    public String getNumOrden() {
        return NumOrden;
    }

    public void setNumOrden(String NumOrden) {
        this.NumOrden = NumOrden;
    }

    public ListaAula getSeccionesE() {
        return seccionesE;
    }

    public void setSeccionesE(ListaAula seccionesE) {
        this.seccionesE = seccionesE;
    }
    
    public void insertarSecciones(Seccion sec){
        seccionesE.insertarAlFinal(sec);
    }
    
}
