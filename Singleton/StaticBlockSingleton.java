package Singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    // Private constructor prevents instantiation from outside the class
    private StaticBlockSingleton() {}

    // Static block for initialization
    static {
        try {
            instance = new StaticBlockSingleton();
            // Additional setup or exception handling can go here
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating Singleton instance.");
        }
    }

    // Method to return the singleton instance
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
