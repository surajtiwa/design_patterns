package designPatterns.creational.singelton.eager;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
    }

    private static LazyRegistryIODH INSTANCE;

    public static LazyRegistryIODH getInstance() {

        if (INSTANCE == null) {
            synchronized (LazyRegistryIODH.class) {//two threads were waiting
                if (INSTANCE == null) {//double check locking
                    INSTANCE = new LazyRegistryIODH();
                }
            }
        }
        return INSTANCE;
    }
}
