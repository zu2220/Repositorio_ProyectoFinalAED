
package pruebaArbol;



public abstract class Usuario  {
    private String tipoUsuario;
    private String Nombre;
    private String Apellido;
    private String DNI;

    

    public Usuario() {
    }

    public Usuario(String tipoUsuario, String Nombre, String Apellido, String DNI) {
        this.tipoUsuario = tipoUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
    }

    
   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    

    
}
