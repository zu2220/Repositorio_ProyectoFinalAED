/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasHash;

import Clases.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class TablaHashUsuario
{

    private Usuario[] THUsuario;
    private int size;
    private int indice[];
    private int DNI;
    // private javax.swing.JTable tablaUsuario;
     
     
    public int[] getIndice()
    {
        return indice;
    }

    public void setIndice(int[] indice)
    {
        this.indice = indice;
    }

    public int getDNI()
    {
        return DNI;
    }

    public void setDNI(int DNI)
    {
        this.DNI = DNI;
    }
    
    
    
    
   
    

    public int getSize()
    {
        return size;
    }

    public TablaHashUsuario(int size)
    {
        THUsuario = new Usuario[size];
        this.size=size;
    }

    public Usuario[] getTHUsuario()
    {
        return THUsuario;
    }

    public void setTHUsuario(Usuario[] THUsuario)
    {
        this.THUsuario = THUsuario;

    }

    public void setSize(int size)
    {
        this.THUsuario = new Usuario[size];
        this.size = size;
    }

    public int AritmeticaModular(int dni)
    {
        //Probamos que: 0 ---> true && 1----> Falso
        int clave = (int) dni % size;
        if (dni >= 0 && dni <=THUsuario.length-1)
        {
            return clave;

        } 
        return 0;
      
        
    }

    public void Quicksort()
    {
        
        
    }

    public void Insertar(Usuario aux)
    {
        int clave = AritmeticaModular(Integer.parseInt(aux.getDNI()));
        if (THUsuario[clave] == null)
        {
            THUsuario[clave] = aux;
            THUsuario[clave].setId(clave);
        } else
        {
            clave++;
            while (THUsuario[clave] != null)
            {

                clave++;

            }
            THUsuario[clave] = aux;
            aux.setId(clave);

        }

    }
    public Usuario getUsuarioByIndex(int i){
        return THUsuario[i];
        

    }
    public void SetNodoByIndex(int i, Usuario aux){
        THUsuario[i]= aux;
        
    }
}
