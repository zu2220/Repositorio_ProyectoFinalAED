package tablaHash;

import pruebaArbol.Usuario;

public class EstudianteTH extends Usuario implements Comparable<EstudianteTH> {
    private int codigo;
    // Cambiado a minúscula para seguir la convención de nombres en Java
    private int indice;
    public EstudianteTH() {
    }

    

    public EstudianteTH(String numOrden, int codigo) {
       
        this.codigo = codigo;
    }

    public EstudianteTH(int codigo) {
        this.codigo = codigo;
    }

    public EstudianteTH(int codigo, String tipoUsuario, String Nombre, String Apellido, String DNI) {
        super(tipoUsuario, Nombre, Apellido, DNI);
        this.codigo = codigo;
    }

    

 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    

    @Override
    public int compareTo(EstudianteTH otroEstudiante) {
        // Compara los objetos EstudianteTH basados en el DNI
        return this.getDNI().compareTo(otroEstudiante.getDNI());
    }
}