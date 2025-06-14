package ChainOfResibility;

public class Gerente extends ObjCadeia{
    public String trata(double solicitacao){
        String resultado = "";
        if(solicitacao <= 10000){
           resultado = "Aprovado Gerente";
        } else {
            if(this.proximo != null){
                resultado = this.proximo.trata(solicitacao);
            }
        }

        return resultado;
    }
}
