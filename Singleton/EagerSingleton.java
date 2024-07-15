package Singleton;

//making it final as it cannot be extended
public final class EagerSingleton {
    //making constructor private so it wont be accessible outside the class
    private EagerSingleton(){
    }
   // making INSTANCE static and final as all the objects will have same instance
    private static final EagerSingleton INSTANCE=new EagerSingleton();
   //this is eager loading, the instance is created when the class is loaded
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
