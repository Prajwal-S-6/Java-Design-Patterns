package org.example.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {


    private LazyRegistryIODH() {
        System.out.println("Initializing singleton LazyRegistryWithIODH");
    }


    public static LazyRegistryIODH getInstance() {
        return Registry.INSTANCE;
    }


    private static class Registry {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }
}
