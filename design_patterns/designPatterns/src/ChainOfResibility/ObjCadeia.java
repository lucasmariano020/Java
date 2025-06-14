package ChainOfResibility;

public abstract class ObjCadeia {
    protected ObjCadeia proximo  = null; 

    public ObjCadeia(){
        
    }

    public ObjCadeia adcProximo(ObjCadeia proximo){
        this.proximo = proximo;
        return proximo;
    }

    public String trata(double solicitacao){
        String resultado = "";
        if(this.proximo != null){
            resultado = this.proximo.trata(solicitacao);
        }

        return(resultado);
    }
    
}
