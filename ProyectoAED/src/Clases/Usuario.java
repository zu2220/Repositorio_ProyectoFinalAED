
package Clases;



public class Usuario  {
    private int id;
    private String tipoUsuario;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Email;
    private String Contrasena;
    

    public Usuario() {
    }

    public Usuario(String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        this.tipoUsuario = tipoUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Email = Email;
        this.Contrasena = Contrasena;
    }

    public Usuario(int id, String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Email = Email;
        this.Contrasena = Contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    

    
}
