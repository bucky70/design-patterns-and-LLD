package Singleton;

public final class BillPughSingleton {
      //making constructor private so it wont be accessible outside the class
      private BillPughSingleton(){
    }
   // making INSTANCE static and final as all the objects will have same instance
   
   //this is thread safe and easy to implement
   private static class BillPughSingltonHelper{
    private static final BillPughSingleton INSTANCE=new BillPughSingleton();
   }
    public static BillPughSingleton getInstance(){
        return BillPughSingltonHelper.INSTANCE;
    }
}

