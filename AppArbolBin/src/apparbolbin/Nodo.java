package apparbolbin;

import dto.PC;

public class Nodo {
    private PC dato;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    public Nodo(PC pc) {
        this.dato = pc;
        this.nodoDer = null;
        this.nodoIzq = null;
    }

    public PC getDato() {
        return dato;
    }

    public void setDato(PC dato) {
        this.dato = dato;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(Nodo nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }
    
    public synchronized boolean insertar(PC nuevoPC){
        if(nuevoPC.hashCode()<this.dato.hashCode()){
            if(this.nodoIzq==null)
                this.nodoIzq=new Nodo(nuevoPC);
            else
                this.nodoIzq.insertar(nuevoPC);
            return true;
        }
        if(nuevoPC.hashCode()>this.dato.hashCode()){
            if(this.nodoDer==null)
                this.nodoDer = new Nodo(nuevoPC);
            else
                this.nodoDer.insertar(nuevoPC);            
            return true;
        }        
        return false;
    }
    
}
