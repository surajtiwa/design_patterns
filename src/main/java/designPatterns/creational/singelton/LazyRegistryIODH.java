package designPatterns.creational.singelton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("LazyRegistryIODH in singelton");
    }



    public static LazyRegistryIODH getInstance() {
        return RegistryIODH.INSTANCE;
    }

    private static class RegistryIODH {//cannot make refernce from outside
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }
}
