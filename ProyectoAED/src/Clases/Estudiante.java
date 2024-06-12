
package Clases;

public class Estudiante extends Usuario {
    private String NumOrden;
    

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
    
    
    
}
