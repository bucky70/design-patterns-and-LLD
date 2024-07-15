package Singleton;

//making it final as it cannot be extended
public final class LazySingleton {
    //making constructor private so it wont be accessible outside the class
    private LazySingleton(){
    }
   // making INSTANCE static and final as all the objects will have same instance
    private static LazySingleton INSTANCE;
   //this is lazy instantiation, the instance is created when the getInstance method is called
    public static LazySingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new LazySingleton();
        }
        return INSTANCE;
    }
}
