
package pruebaArbol;

public class Estudiante {
    
    private int edad;
    private String nombre;
    private String apellido;
    private String dni;

    public Estudiante(int edad, String nombre, String apellido, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Estudiante(){}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
