package pruebaArbol;

public class Estudiante extends Usuario implements Comparable<Estudiante> {
    private int codigo; // Cambiado a minúscula para seguir la convención de nombres en Java

    public Estudiante() {
    }

    

    public Estudiante(String numOrden, int codigo) {
       
        this.codigo = codigo;
    }

    public Estudiante(int codigo) {
        this.codigo = codigo;
    }

    public Estudiante(int codigo, String tipoUsuario, String Nombre, String Apellido, String DNI) {
        super(tipoUsuario, Nombre, Apellido, DNI);
        this.codigo = codigo;
    }

    

 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        // Compara los objetos Estudiante basados en el DNI
        return this.getDNI().compareTo(otroEstudiante.getDNI());
    }
}