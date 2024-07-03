/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import Clases.Estudiante;
import ListasEnlazadas.NodoEstudiante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hector
 */
public class ArbolEstudiante
{

    private NodoArbolEstudianteAB raiz;
    private Object dtmTablaDatos;

    public ArbolEstudiante()
    {
        raiz = null;
    }

    // Método para insertar un nodo en el árbol
    /* public void insertarNodo(Estudiante dato) {
        if (raiz == null) {
            raiz = new NodoArbolEstudianteAB(dato);
        } else {
            insertar(raiz, dato);
        }
        size++;
    }*/
    // Método auxiliar para la inserción de un nodo
    /* private void insertar(NodoArbolEstudianteAB nodo, Estudiante dato) {
       if (dato.getEdad()< nodo.getDato().getEdad()) {
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new NodoArbolEstudianteAB(dato));
            } else {
                insertar(nodo.getIzquierda(), dato);
            }
        } else if (dato.getEdad()>nodo.getDato().getEdad()) {
            if (nodo.getDerecha() == null) {
                nodo.setDerecha(new NodoArbolEstudianteAB(dato));
            } else {
                insertar(nodo.getDerecha(), dato);
            }
        }
    } */
    public void insertar(EstudianteAB dato)
    {
        NodoArbolEstudianteAB nuevo = new NodoArbolEstudianteAB(dato);
        if (raiz == null)
        {
            raiz = nuevo;

        } else
        {
            NodoArbolEstudianteAB tem = raiz;
            NodoArbolEstudianteAB Padre;
            while (true)
            {
                Padre = tem;
                if (dato.getDNI() < tem.getDato().getDNI())
                {
                    tem = tem.getIzquierda();
                    if (tem == null)
                    {
                        Padre.setIzquierda(nuevo);
                        return;
                    }
                } else
                {
                    tem = tem.getDerecha();
                    if (tem == null)
                    {
                        Padre.setDerecha(nuevo);
                        return;
                    }

                }
            }
        }

    }

    // Método para recorrer el árbol en preorden
    public void recorrerPreorden(NodoArbolEstudianteAB nodo, DefaultTableModel auxdtm)
    {
        if (nodo != null)
        {
            Object o[] = new Object[4];
            o[0] = nodo.getDato().getNombre();
            o[1] = nodo.getDato().getNombre();
            o[2] = nodo.getDato().getDNI();
            o[3] = nodo.getDato().getEdad();
            auxdtm.addRow(o);
            recorrerPreorden(nodo.getIzquierda(), auxdtm);
            recorrerPreorden(nodo.getDerecha(), auxdtm);
        }
    }

    // Método para recorrer el árbol en inorden
    private void recorrerInorden(NodoArbolEstudianteAB nodo)
    {
        if (nodo != null)
        {
            recorrerInorden(nodo.getIzquierda());
            System.out.print(nodo.getDato() + " ");
            recorrerInorden(nodo.getDerecha());
        }
    }

    // Método para recorrer el árbol en postorden
    public void Postorden(NodoArbolEstudianteAB nodo, DefaultTableModel auxdtm)
    {
        if (nodo != null)
        {
            Postorden(nodo.getIzquierda(), auxdtm);
            Postorden(nodo.getDerecha(), auxdtm);
            Object o[] = new Object[4];
            o[0] = nodo.getDato().getNombre();
            o[1] = nodo.getDato().getNombre();
            o[2] = nodo.getDato().getDNI();
            o[3] = nodo.getDato().getEdad();
            auxdtm.addRow(o);

        }
    }

    /* public void buscarelemento(int datito){
	NArbol tem= raiz;
		while(tem.getDato()!= datito){
			if(datito < tem.getDato()){
				tem= tem.getIzq();
				
			
			} else{
				tem = tem.getDer();
			}
		if (tem == null){
			return null;
		}
		
		}
			return tem;


} */
    public NodoArbolEstudianteAB buscarelemento(int DNI, DefaultTableModel dtm)
    {
        NodoArbolEstudianteAB tem = this.raiz;
        while (tem.getDato().getDNI() != DNI)
        {
            if (DNI < tem.getDato().getDNI())
            {
                tem = tem.getIzquierda();
            } else
            {
                tem = tem.getDerecha();
            }
            try
            {
                if (tem.getDato() == null)
                {
                    return null;
                }

            } catch (Exception e)
            {

                JOptionPane.showMessageDialog(null, "error 2");
            }

        }

        return tem;
    }
    //AL metodo le falta el parametro DefaulTableModel

    /*
       private NodoArbolEstudianteAB buscarNodo(NodoArbolEstudianteAB nodo, Estudiante dato) {
        if (nodo == null || nodo.getDato().equals(dato)) {
            return nodo;
        }
        if (dato.getEdad() < 0) {
            return buscarNodo(nodo.getIzquierda(), dato);
        } else {
            return buscarNodo(nodo.getDerecha(), dato);
        }
    }*/
    // Método para eliminar un nodo del árbol
    /* public void eliminarNodo(Estudiante dato) {
        raiz = eliminarNodo(raiz, dato);
        size--;
    }

   /* private NodoArbolEstudianteAB eliminarNodo(NodoArbolEstudianteAB nodo, Estudiante dato) {
        if (nodo == null) {
            return null;
        }
        if (dato.getEdad()<(nodo.getDato().getEdad())) {
            nodo.setIzquierda(eliminarNodo(nodo.getIzquierda(), dato));
        } else if (dato.getEdad()==(nodo.getDato().getEdad())) {
            nodo.setDerecha(eliminarNodo(nodo.getDerecha(), dato));
        } else {
            // Nodo con un solo hijo o sin hijos
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            } else {
                // Nodo con dos hijos: obtener el sucesor en inorden (menor de la subárbol derecho)
                NodoArbolEstudianteAB minimo = encontrarMinimo(nodo.getDerecha());
                nodo.setDato(minimo.getDato());
                nodo.setDerecha(eliminarNodo(nodo.getDerecha(), minimo.getDato()));
            }
        }
        return nodo;
    }**/
    // Método auxiliar para encontrar el nodo con el valor mínimo
    private NodoArbolEstudianteAB encontrarMinimo(NodoArbolEstudianteAB nodo)
    {
        while (nodo.getIzquierda() != null)
        {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }

    public void inorden(NodoArbolEstudianteAB nodo, DefaultTableModel dtm)
    {
        if (nodo != null)
        {
            inorden(nodo.getIzquierda(), dtm);
            Object o[] = new Object[4];
            o[0] = nodo.getDato().getNombre();
            o[1] = nodo.getDato().getApellido();
            o[2] = nodo.getDato().getDNI();
            o[3] = nodo.getDato().getEdad();
            dtm.addRow(o);

            inorden(nodo.getDerecha(), dtm);
        }
    }

    // Método para obtener el tamaño del árbol
    // Método para verificar si el árbol está vacío
    /* public void insertar_preorden(Estudiante dato){
        NodoArbolEstudianteAB nuevo = new NodoArbolEstudianteAB(dato);
        if(raiz == null){
            raiz= nuevo;     
        } else{
            NodoArbolEstudianteAB tem= raiz;
            NodoArbolEstudianteAB padre;
              while(true){
                padre= tem;
                if(nuevo.getDato().getEdad()< tem.getDato().getEdad()){
                    tem= tem.getIzquierda();
                    if( tem == null){
                        padre.setIzquierda(nuevo);
                        return;
                    
                    } else{
                        tem= tem.getDerecha();
                        if(tem == null){
                            padre.setDerecha(nuevo);
                            return;
                        
                        }
                    }
                
                
                }
            
            
            }
        }
          
    }*/
    public NodoArbolEstudianteAB getRaiz()
    {
        return raiz;
    }

    public void setRaiz(NodoArbolEstudianteAB raiz)
    {
        this.raiz = raiz;
    }

    public NodoArbolEstudianteAB buscar2(int dni)
    {
        boolean encontrado = false;
        NodoArbolEstudianteAB tem = raiz;
        while (!encontrado && tem != null)
        {
            if (dni == tem.getDato().getDNI())
            {
                encontrado = true;

            } else if (dni < tem.getDato().getDNI())
            {
                tem = tem.getIzquierda();

            } else
            {
                tem = tem.getDerecha();
            }

        }

        return tem;

    }

    public void eliminarNodoMasDerecho()
    {
        if (raiz == null)
        {

            return;
        }
        NodoArbolEstudianteAB actual = raiz;
        NodoArbolEstudianteAB padre = null;

        while (actual.getDerecha() != null)
        {
            padre = actual;
            actual = actual.getDerecha();
        }
        if (padre == null)
        {
            raiz = null;
        } else
        {
            padre = padre.getDerecha();
        }
        //Mostrar datos en la tabla

    }

    public void eliminarNodoMasDerechoYActualizarTabla(javax.swing.table.DefaultTableModel dtm)
    {
        Object o[] = new Object[4];
        EstudianteAB est = new EstudianteAB();
        NodoArbolEstudianteAB nodo = new NodoArbolEstudianteAB(est);
        eliminarNodoMasDerecho();

        dtm.addRow(o);
        o[0] = nodo.getDato().getNombre();
        o[1] = nodo.getDato().getApellido();
        o[2] = nodo.getDato().getDNI();
        o[3] = nodo.getDato().getEdad();
        int fila = dtm.getRowCount() - 1; // Eliminamos la última fila
        dtm.removeRow(fila);
    }

}
