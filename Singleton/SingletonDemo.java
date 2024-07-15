package Singleton;

public class SingletonDemo{
  public static void main(String args[]){
    //eager initialisation
    EagerSingleton eagerExample1=EagerSingleton.getInstance();
    EagerSingleton eagerExample2=EagerSingleton.getInstance();
    System.out.println("eagerExample1 : "+eagerExample1);
    System.out.println("eagerExample2 : "+eagerExample2);

    //lazy initialisation
    LazySingleton lazyExample1=LazySingleton.getInstance();
    LazySingleton lazyExample2=LazySingleton.getInstance();
    System.out.println("lazyExample1 : "+lazyExample1);
    System.out.println("lazyExample2 : "+lazyExample2);

    //thread safe initialization
    ThreadSafeSingleton threadSafeExample1=ThreadSafeSingleton.getInstance();
    ThreadSafeSingleton threadSafeExample2=ThreadSafeSingleton.getInstance();
    System.out.println("threadSafeExample1 : "+lazyExample1);
    System.out.println("threadSafeExample2 : "+lazyExample2);

  }
}