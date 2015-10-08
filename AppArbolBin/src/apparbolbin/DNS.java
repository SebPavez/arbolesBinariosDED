package apparbolbin;

import dto.PC;

public class DNS {
    private Nodo raiz;

    public DNS() {
        this.raiz = null;
    }
    
    public boolean agregarNodo(PC datoNuevo){
        if(this.raiz == null)
        {
            this.raiz = new Nodo(datoNuevo);
            return true;
        }
        else
        {
            return this.raiz.insertar(datoNuevo);            
        }        
    }
    
    public boolean agregarNodo(String ip,String dominio){
        PC instancia = new PC(ip, dominio);
        return agregarNodo(instancia);
    }
    
    public String buscarIP(String dominio){
        
    }
    //implementar listar IPs en el arbol
}
