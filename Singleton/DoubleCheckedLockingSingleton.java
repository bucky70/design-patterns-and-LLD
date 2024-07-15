package Singleton;

public final class DoubleCheckedLockingSingleton {
    // Static member holds only one instance of the DoubleCheckedLockingSingleton class
    private static volatile DoubleCheckedLockingSingleton instance;

    // Private constructor prevents any other class from instantiating
    private DoubleCheckedLockingSingleton() { }

    // Providing Global point of access
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}