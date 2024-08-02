
package Arbol;




public class NodoArbolEstudianteAB {
     private EstudianteAB dato;
    private NodoArbolEstudianteAB izquierda;
    private NodoArbolEstudianteAB derecha;
    private NodoArbolEstudianteAB hijo;
    private NodoArbolEstudianteAB hijoizq;
    private NodoArbolEstudianteAB hijoder;
    private NodoArbolEstudianteAB raiz;

    public NodoArbolEstudianteAB getHijo()
    {
        return hijo;
    }

    public void setHijo(NodoArbolEstudianteAB hijo)
    {
        this.hijo = hijo;
    }

    public NodoArbolEstudianteAB getHijoizq()
    {
        return hijoizq;
    }

    public void setHijoizq(NodoArbolEstudianteAB hijoizq)
    {
        this.hijoizq = hijoizq;
    }

    public NodoArbolEstudianteAB getHijoder()
    {
        return hijoder;
    }

    public void setHijoder(NodoArbolEstudianteAB hijoder)
    {
        this.hijoder = hijoder;
    }
    
    
    public NodoArbolEstudianteAB(EstudianteAB dato) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.hijo= hijo;
        this.derecha = derecha;
        this.hijoder= hijoder;
        this.hijoizq= hijoizq;
    }

    public NodoArbolEstudianteAB() {
    }
    

    public EstudianteAB getDato() {
        return dato;
    }

    public void setDato(EstudianteAB dato) {
        this.dato = dato;
    }

    public NodoArbolEstudianteAB getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbolEstudianteAB izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbolEstudianteAB getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbolEstudianteAB derecha) {
        this.derecha = derecha;
    }
         //El metodo Eliminar de tipo NodoArbolEstudianteAB es eliminar izquierda:
        public NodoArbolEstudianteAB Eliminar(NodoArbolEstudianteAB raiz, EstudianteAB Numero){
            if(raiz == null){
                return raiz;
            }
            if(Numero.getDNI() > raiz.getDato().getDNI()){
                raiz.setHijoder(this.Eliminar(raiz.getHijoizq(), Numero));
            } else if(Numero.getDNI()< raiz.getDato().getDNI()){
                raiz.setHijoder(this.Eliminar(raiz.getHijoder(), Numero));
            } else{
                if(raiz.getHijoizq()== null && raiz.getHijoder()== null){
                    raiz= null;
                
                } else if (raiz.getHijoder()!= null){
                    int Sucesor = 2568;
                    raiz.getDato().setDNI(Sucesor);
                    raiz.setHijoder(this.Eliminar(raiz.getHijoder(), raiz.getDato()));
                } else{
                    raiz.setDato(this.Predesor(Numero, raiz));
                    raiz.setHijoizq(this.Eliminar(raiz, Numero));
                }
                
            }
            
            
        
        return raiz;
        
        
        }
    public void EliminarNodo(EstudianteAB numero){
         NodoArbolEstudianteAB raiz= new NodoArbolEstudianteAB();
        this.raiz=this.Eliminar(raiz, numero);
    
    }

    public int Sucesor(int Sucesor, NodoArbolEstudianteAB raiz){
        raiz= raiz.getHijoder();
        while(raiz.getHijoizq()!=null){
            raiz= raiz.getHijoder();
        
        }
        
        return raiz.getDato().getDNI();
    }
    public EstudianteAB Predesor(EstudianteAB Predesor, NodoArbolEstudianteAB raiz){
    
        while(raiz.getHijoizq()!= null){
            raiz= raiz.getHijoder();
        
        }
        return raiz.getDato();
    }
    //Este es el metodo para eliminar por derecho
    public NodoArbolEstudianteAB Eliminar2(NodoArbolEstudianteAB raiz, EstudianteAB Numero){
             if(raiz == null){
                return raiz;
            }
            if(Numero.getDNI() > raiz.getDato().getDNI()){
               raiz.setHijoizq(this.Eliminar(raiz.getHijoder(), Numero));
            } else if(Numero.getDNI()< raiz.getDato().getDNI()){
                raiz.setHijoizq(this.Eliminar(raiz.getHijoizq(), Numero));
            } else{
                if(raiz.getHijoder()== null && raiz.getHijoder()== null){
                    raiz= null;
                
                } else if (raiz.getHijoizq()!= null){
                    int Sucesor = 2568;
                    raiz.getDato().setDNI(Sucesor);
                    raiz.setHijoizq(this.Eliminar(raiz.getHijoizq(), raiz.getDato()));
                } else{
                    raiz.setDato(this.Predesor(Numero, raiz));
                    raiz.setHijoder(this.Eliminar(raiz, Numero));
                }
                
            }
        
        
    
    
        return raiz;
    }
    
}
