/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasHash;

import ClasesProyectoFinalAED.Usuario;
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

    public void Quicksort() {
        
        
    }

    public void MergeSort(){
    
    
    
    
    }




    public void ShellSort(){
    
    
    
    
    
    
    
    }
    
    
    
       public int particion(int low, int high) {
        // Using modulus to select pivot
        int pivotIndex = low + (high - low) % (high - low + 1);
        Usuario pivot = THUsuario[pivotIndex];
        swap(pivotIndex, high);  // Move pivot to end

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (THUsuario[j].getId() <= pivot.getId()) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);  // Move pivot to its final place
        return i + 1;
    }
    
          public void swap(int i, int j) {
        Usuario temp = THUsuario[i];
        THUsuario[i] = THUsuario[j];
        THUsuario[j] = temp;
    }
       
          
       public void mergeSort() {
        if (size < 2) {
            return;
        }
        mergeSort(0, size - 1);
    }

    public void mergeSort(int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    public void merge(int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Usuario[] leftArray = new Usuario[n1];
        Usuario[] rightArray = new Usuario[n2];

        System.arraycopy(THUsuario, left, leftArray, 0, n1);
        System.arraycopy(THUsuario, middle + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].getId() <= rightArray[j].getId()) {
                THUsuario[k++] = leftArray[i++];
            } else {
                THUsuario[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            THUsuario[k++] = leftArray[i++];
        }

        while (j < n2) {
            THUsuario[k++] = rightArray[j++];
        }
    }

    public void printArray() {
        for (Usuario usuario : THUsuario) {
            System.out.println(usuario);
        }
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
    
       public void shellSort() {
        int n = size;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Usuario temp = THUsuario[i];
                int j;
                for (j = i; j >= gap && THUsuario[j - gap].getId() > temp.getId(); j -= gap) {
                    THUsuario[j] = THUsuario[j - gap];
                }
                THUsuario[j] = temp;
            }
        }
    }

     public void printArrayShell() {
        for (Usuario usuario : THUsuario) {
            System.out.println(usuario);
        }
    }
}
