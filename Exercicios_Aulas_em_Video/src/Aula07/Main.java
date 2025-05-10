/*Categorias: pesos leve, médio, pesado.
 * A luta só pode ser marcada entre lutadores da mesma categoria.
 * Desafiado e desafiante devem ser diferentes.
 * A luta só pode ocorrer se ela estiver aprovada.
 * Só pode ter como resultado a vitória de um dos lutadores ou o empate.
*/

package Aula07;
public class Main {
    public static void main (String args[]){
        Lutador[]L = new Lutador[5];
        L[0] = new Lutador("Prety Boy", "França", 21, 1.75f, 68.9f, 11, 3, 1);
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 100f, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Autralia", 28, 1.93f, 81.6f, 13, 0, 2);
        L[4] = new Lutador("Castanha do Pará", "Brasil", 30, 2.10f, 102f, 5, 2, 2);

        /*L[0].apresentar();
        L[2].status();
        L[3].getCategoria();
        L[1].ganharLuta();
        L[0].empatarLuta();
        L[4].apresentar();
        L[4].ganharLuta();
        L[4].status();
        L[4].empatarLuta();
        L[4].perderLuta();
        System.out.println(L[0].getNome());
        L[4].status();*/
        Luta luta = new Luta(); //desafiante, desafiado.
        luta.marcarLuta(L[0], L[1]);
        luta.lutar();
        luta.marcarLuta(L[0], L[2]);
        luta.lutar();
        luta.marcarLuta(L[2], L[4]);
        luta.lutar();

   }

}
