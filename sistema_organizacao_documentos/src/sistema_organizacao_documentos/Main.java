package sistema_organizacao_documentos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Documento> biblioteca = new ArrayList<>();
        biblioteca.add(new Texto("Relatório Anual", "Carlos Silva", 250, 1500));
        biblioteca.add(new Planilha("Finanças", "Maria Souza", 120, 500));
        biblioteca.add(new Apresentacao("Pitch Vendas", "João Pereira", 340, 15));

        for (Documento doc : biblioteca) {
            System.out.println(doc);
            doc.abrir();
            doc.formatar();
        }
        
    }
}
