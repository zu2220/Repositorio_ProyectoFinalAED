
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
         eliminarNodoMasDerecho();
        // Actualiza la tabla aquí
        dtm.setRowCount(0); // Limpia la tabla
        recorrerInorden(raiz, dtm); // Vuelve a llenar la tabla con los datos actuales
    }
 
        public void eliminar(NodoArbolEstudianteAB dato) throws Exception{
            EstudianteAB est= new EstudianteAB();
            NodoArbolEstudianteAB aux= new NodoArbolEstudianteAB(est);
            EstudianteAB nuevo = new EstudianteAB();
            raiz= eliminarN(raiz,nuevo);
                
        }
        public NodoArbolEstudianteAB eliminarN(NodoArbolEstudianteAB aux, EstudianteAB data) throws Exception{
            EstudianteAB aux1= new EstudianteAB();
            NodoArbolEstudianteAB iz= new NodoArbolEstudianteAB(aux1);
            NodoArbolEstudianteAB der= new NodoArbolEstudianteAB(aux1);
            if(aux== null){
                throw new Exception("Nodo no encontrado");
            
            
            
            } else if(aux1.getDNI()< aux1.getDNI() ){
                ArbolEstudiante iz1= new ArbolEstudiante();
              aux.setIzquierda(aux);
            
            } else if(data.getDNI()>aux1.getDNI()){
                 der= eliminarN(der.getDerecha(), aux1);
                 aux.setDerecha(der);
            } else{
                NodoArbolEstudianteAB p= der;
                if(p.getDerecha()== null){
                    aux= p.getIzquierda();
                
                } else if(p.getIzquierda()== null){
                    aux= p.getDerecha();
                
                } else{
                    p= cambiar(p);
                }
            }
        NodoArbolEstudianteAB p = null;
            return der;
         
        }
        
        public NodoArbolEstudianteAB cambiar(NodoArbolEstudianteAB aux){
            NodoArbolEstudianteAB p= aux;
            NodoArbolEstudianteAB a= aux.getIzquierda();
            while(a.getDerecha()!= null){
                p= a;
                a= a.getDerecha();
            }
            aux.setDato(a.getDato());
            
        
        
            return null;
        }
        
        
        
        
        
    
}