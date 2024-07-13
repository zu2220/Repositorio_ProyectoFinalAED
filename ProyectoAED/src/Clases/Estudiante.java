
package Clases;




public class Estudiante extends Usuario {
    private String NumOrden;
    
    

    public Estudiante(String NumOrden) {
        this.NumOrden = NumOrden;
    }

    public Estudiante(String NumOrden, int id, String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(id, tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
        this.NumOrden = NumOrden;
    }

   

    
    

    

    public String getNumOrden() {
        return NumOrden;
    }

    public void setNumOrden(String NumOrden) {
        this.NumOrden = NumOrden;
    }

    
}
