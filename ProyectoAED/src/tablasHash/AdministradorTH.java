
package tablasHash;


public class AdministradorTH {
    private String nombre;
    private String apellido;
    private int DNI;
    private int clave;

    public AdministradorTH() {
    }

    public AdministradorTH(String nombre, String apellido, int DNI, int clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
}
