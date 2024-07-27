package practice_area.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){

    }
     class helperClass{
         final static BillPughSingleton INSTANCE=new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return helperClass.INSTANCE;
    }
}
