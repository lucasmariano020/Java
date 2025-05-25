package Aula06;

public class Main {
    public static void main(String[] args)
        {
            ControleRemoto c = new ControleRemoto();
            c.maisVolume();
            c.ligar();
            c.abrirMenu();
            c.ligarMudo();
            c.abrirMenu();
            c.fecharMenu();
            c.desligar();
            c.maisVolume();
            c.abrirMenu();
            c.desligarMudo();
            c.menosVolume();
            c.abrirMenu();
        }
}
