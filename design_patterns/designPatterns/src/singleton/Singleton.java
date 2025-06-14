package singleton;

public class Singleton {

    /** Unique instance of the class (created on first access). */
    private static Singleton instance;

    /**
     * Returns the single instance, creating it if necessary.
     * Uses double-checked locking to keep synchronization overhead low.
     */
    public static Singleton getInstance() {
        if (instance == null) {                  // 1ª verificação (sem travar)     // trava apenas na 1ª criação
                if (instance == null) {          // 2ª verificação (com trava)
                    instance = new Singleton();
                }
            
        }
        return instance;
    }

    /** Construtor privado: impede instâncias externas. */
    private Singleton() {
        // inicialize recursos aqui, se necessário
    }

}
