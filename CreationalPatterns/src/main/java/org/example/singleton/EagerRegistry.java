package org.example.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    private static EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
        System.out.println("Initializing Eager Registry");
    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }

}