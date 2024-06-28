
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
            int i=clave+1;
            while(true){
                if(THAdministrador[i]==null){
                    THAdministrador[i]=admin;
                    THAdministrador[i].setClave(i);
                    return;
                }
                if(i==size && admin.getClave()==0){
                    JOptionPane.showMessageDialog(null,"Tabla llena");
                    return;
                }
                i++;
            }
            
            
        }
    }
    
}
