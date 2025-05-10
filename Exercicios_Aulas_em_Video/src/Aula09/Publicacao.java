package Aula09;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear();
    public abstract void avancarPag(int paginas);
    public abstract void voltarPag(int paginas);

}
