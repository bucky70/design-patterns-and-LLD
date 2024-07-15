package Singleton;

public class ThreadSafeSingleton {
       //making constructor private so it wont be accessible outside the class
       private ThreadSafeSingleton(){
    }
   // making INSTANCE static and final as all the objects will have same instance
    private static ThreadSafeSingleton INSTANCE;
   //this is eager loading, the instance is created when the class is loaded
    public static synchronized ThreadSafeSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
