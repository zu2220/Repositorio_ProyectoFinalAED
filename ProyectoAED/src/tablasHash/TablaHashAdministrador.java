
package tablasHash;

import javax.swing.JOptionPane;


public class TablaHashAdministrador {
    private int size;
    private AdministradorTH[] THAdministrador;
    
    public TablaHashAdministrador(int size){
        this.THAdministrador=new AdministradorTH[size];
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public AdministradorTH[] getTHAdministrador() {
        return THAdministrador;
    }

    public void setTHAdministrador(AdministradorTH[] THAdministrador) {
        this.THAdministrador = THAdministrador;
    }
    //-----------metodos de la clase---------------------------
    public int generarLlave(int aux){
        return aux%this.size;
    }
    public void insertar(AdministradorTH admin){
        //AdministradorTH auxAdmin=admin;
        int clave=generarLlave(admin.getDNI());
        if(THAdministrador[clave]==null){
            THAdministrador[clave]=admin;
            THAdministrador[clave].setClave(clave);
        }else{
            //creamos un array que almacena las opciones que se mostrarán en el JOptionPane
            String[] opciones={"Seleccionar opción","Exploracion cuadrática","Exploracion lineal"};
            
            int i=JOptionPane.showOptionDialog(
                    null,
                    "Elija un método para evitar la colisión",
                    "Se detectó una colisión",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,opciones[0]);
            };
            
            switch(i){
                case 1:
                    //Exploración cuadrática
                    int aux=clave;
                    int i=1;
                    while(THAdministrador[aux]!=null){
                        aux+=Math.pow(i, 2);
                        if(aux>THAdministrador.length)
                        
                    }
                    
            }
            
        
    }
    public AdministradorTH[] tablaHValores(){
        return this.THAdministrador;
    }
    //metodos de dispersión
        //Aritmetica modular
    //metodos para evitar colisión

    public int exploracion_cuadratica(int indice) {
            int aux=!;
            int aux2=indice+aux;
            while(THAdministrador[indice]!=null){
                THAdministrador[indice+aux*aux]
            }
    }
    
}
