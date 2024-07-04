
package Arbol;


import javax.swing.table.DefaultTableModel;


public class ArbolEstudiante
{

    private NodoArbolEstudianteAB raiz;

    public ArbolEstudiante()
    {
        raiz = null;
    }

    
    public void insertar(EstudianteAB dato){
    NodoArbolEstudianteAB nuevo= new NodoArbolEstudianteAB(dato);
    if(raiz==null){
        raiz=nuevo;
       
    } else{
        NodoArbolEstudianteAB tem= raiz;
        NodoArbolEstudianteAB Padre;
        while(true){
            Padre= tem;
            if(dato.getEdad() < tem.getDato().getEdad()){
                tem= tem.getIzquierda();
                if(tem == null){
                    Padre.setIzquierda(nuevo);
                    break;
                    
                }
            } else{
                tem= tem.getDerecha();
                if(tem== null){
                    Padre.setDerecha(nuevo);
                    break;
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
            Object oo[] = new Object[4];
            oo[0] = nodo.getDato().getNombre();
            oo[1]=nodo.getDato().getApellido();
            oo[2] = nodo.getDato().getDNI();
            oo[3] = nodo.getDato().getEdad();

            auxdtm.addRow(oo);
            recorrerPreorden(nodo.getIzquierda(), auxdtm);
            recorrerPreorden(nodo.getDerecha(), auxdtm);
        }
    }

    // Método para recorrer el árbol en inorden

    

    public void recorrerInorden(NodoArbolEstudianteAB nodo,DefaultTableModel auxdtm) {
        if (nodo!= null) {
            recorrerInorden(nodo.getIzquierda(),auxdtm);
            Object o[]= new Object[4];
            o[0]= nodo.getDato().getNombre();
            o[1]= nodo.getDato().getApellido();
            o[2]= nodo.getDato().getDNI();
            o[3]= nodo.getDato().getEdad();
            auxdtm.addRow(o);
            recorrerInorden(nodo.getDerecha(),auxdtm);
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

    public NodoArbolEstudianteAB buscarelemento(int DNI){
           NodoArbolEstudianteAB tem=raiz;
           while (tem != null) {
                if (DNI < tem.getDato().getDNI()) {
                    tem = tem.getIzquierda();
                } else if (DNI > tem.getDato().getDNI()) {
                             tem = tem.getDerecha();
                } else {
                    return tem; // Se encontró el nodo con el DNI buscado
                  }
            }
    
            return null; 
           
    }
    
    
    public NodoArbolEstudianteAB getRaiz(){
        return this.raiz;
    }

    public void setRaiz(NodoArbolEstudianteAB raiz)
    {
        this.raiz = raiz;
    }
    
    public void eliminarPorIzquierda(NodoArbolEstudianteAB eliminar){
    
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
