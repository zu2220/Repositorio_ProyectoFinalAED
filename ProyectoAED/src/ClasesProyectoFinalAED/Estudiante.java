
package ClasesProyectoFinalAED;

import javax.swing.JOptionPane;




public class Estudiante extends Usuario {
    private String NumOrden;
    private Seccion Secciones;

    public Seccion getSecciones() {
        return Secciones;
    }

    public void setSecciones(Seccion Secciones) {
        this.Secciones = Secciones;
    }
    
    

    public Estudiante(String NumOrden, String TiUs, String nombreU, String apellidoU, String dniU, String emailU, String contraU) {
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

    public void insertarSecciones(Seccion auxSeccion) {
          JOptionPane.showMessageDialog(null, "Si se escribió en la seccion");
    }

    
}
