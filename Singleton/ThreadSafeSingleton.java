package Singleton;

public class ThreadSafeSingleton {
       //making constructor private so it wont be accessible outside the class
       private ThreadSafeSingleton(){
    }
   // making INSTANCE static and final as all the objects will have same instance
    private static ThreadSafeSingleton INSTANCE;
   //this makes instantiation thread safe
    public static synchronized ThreadSafeSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
