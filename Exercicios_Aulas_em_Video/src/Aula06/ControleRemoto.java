package Aula06;

public class ControleRemoto implements Controlador{
//Atributes
private int volume;
private boolean ligado;
private boolean tocando;

//Especial Methods
public ControleRemoto() {
    setVolume(50);
    setLigado(true);
    setTocando(false);
}
private int getVolume() {
    return volume;
}
private void setVolume(int volume) {
    this.volume = volume;
}
private boolean isLigado() {
    return ligado;
}
private void setLigado(boolean ligado) {
    this.ligado = ligado;
}
private boolean isTocando() {
    return tocando;
}
private void setTocando(boolean tocando) {
    this.tocando = tocando;
}

//Abstract Methods
@Override
public void abrirMenu() {
    System.out.println();
    System.out.println();
    System.out.println("------ MENU ------");
    System.out.println("Está ligado?: " + this.isLigado());
    System.out.println("Está tocando?: " + this.isTocando());
    System.out.print("Volume: " + this.getVolume());
    for(int i = 0; i <= this.getVolume(); i+=10) {
        System.out.print(" |");
    }
    System.out.println();
}
@Override
public void fecharMenu() {
    System.out.println("\nFechando Menu...");
    System.out.println();
}
@Override
public void ligar() {
    this.setLigado(true);
}
@Override
public void desligar() {
    this.setLigado(false);
}
@Override
public void desligarMudo() {
    if(this.isLigado() && this.getVolume() == 0){
        setVolume(50);
    }
    else if(this.isLigado() == false){
        System.out.println("\nO dispositivo não está ligado");
    }
}
@Override
public void ligarMudo() {
    if(this.isLigado() && this.getVolume() > 0){
        setVolume(0);
        System.out.println("\nDispositivo no mudo");
    }
    else if(this.getVolume() > 0){
        System.out.println("\nO dispositivo não está ligado");
    }
    else if(this.getVolume() < 0)
        System.out.println("\nO dispositivo está no mudo");
    }

@Override
public void maisVolume() {
    if(this.isLigado()){
        this.setVolume(this.getVolume() + 5);
    }
    else{
        System.out.println("\nO dispositivo não está ligado");
    }
}
@Override
public void menosVolume() {
    if(this.isLigado()){
        this.setVolume(this.getVolume() - 5);
    }
    else{
        System.out.println("\nO dispositivo não está ligado");
    }
}
@Override
public void play() {
    if(this.isLigado() && !(this.isTocando())){
        this.setTocando(true);
    }
}
@Override
public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
        else if(this.isLigado() == false){
            System.out.println("\nO dispositivo não está ligado");
        }
}

}
