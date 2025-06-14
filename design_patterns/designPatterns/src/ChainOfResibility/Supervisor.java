package ChainOfResibility;

public class Supervisor extends ObjCadeia{
    public String trata(double solicitacao){
        String resultado = "";
        if(solicitacao <= 1000){
           resultado = "Aprovado Supervisor";
        } else {
            if(this.proximo != null){
                resultado = this.proximo.trata(solicitacao);
            }
        }

        return resultado;
    }
}
