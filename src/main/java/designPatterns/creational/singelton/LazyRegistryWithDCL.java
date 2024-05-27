package designPatterns.creational.singelton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {


    private static volatile LazyRegistryWithDCL INSTANCE;//thread should not use cache values but main memory

    public static LazyRegistryWithDCL getInstance() {

        if (INSTANCE == null) {
            synchronized (LazyRegistryIODH.class) {//two threads were waiting
                if (INSTANCE == null) {//double check locking
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
