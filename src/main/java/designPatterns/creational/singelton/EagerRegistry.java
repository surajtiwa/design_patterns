package designPatterns.creational.singelton.eager;

/**
 * This class uses eager initialization of singleton instance.
 */
public final class EagerRegistry {

    private EagerRegistry() {//for avoiding inheritance

    }

    private static final EagerRegistry instance = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return instance;
    }

}