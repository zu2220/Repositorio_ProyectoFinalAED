package pruebaArbol;

public class Estudiante extends Usuario implements Comparable<Estudiante> {
    private String numOrden; // Cambiado a minúscula para seguir la convención de nombres en Java
    private int codigo; // Cambiado a minúscula para seguir la convención de nombres en Java

    public Estudiante() {
    }

    public Estudiante(String numOrden) {
        this.numOrden = numOrden;
    }

    public Estudiante(String numOrden, String tipoUsuario, String nombre, String apellido, String dni, String email, String contrasena) {
        super(tipoUsuario, nombre, apellido, dni, email, contrasena);
        this.numOrden = numOrden;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        // Compara los objetos Estudiante basados en el DNI
        return this.getDNI().compareTo(otroEstudiante.getDNI());
    }
}