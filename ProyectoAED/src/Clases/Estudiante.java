
package Clases;


import ListasEnlazadas.ListaSeccion;

public class Estudiante extends Usuario {
    private String NumOrden;
    private ListaSeccion seccionesE;
    

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

    public ListaSeccion getSeccionesE() {
        return seccionesE;
    }

    public void setSeccionesE(ListaSeccion seccionesE) {
        this.seccionesE = seccionesE;
    }
    
    public void insertarSecciones(Seccion sec){
        seccionesE.insertarAlFinal(sec);
    }
    
}
