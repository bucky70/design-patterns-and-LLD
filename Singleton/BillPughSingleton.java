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

/*

Lazy Initialization:

Unlike eager initialization, the singleton instance is created only when it's first requested (i.e., lazy loading). This ensures that resources are not wasted if the instance is never used, making it more efficient in scenarios where the instance might not always be needed.
Thread Safety:

The Bill Pugh implementation is inherently thread-safe, without the need for synchronization or locks. This is because the instance is created within the Helper class (or static inner class), and class loading in Java is thread-safe by design. This guarantees that the singleton instance is created only once in a multithreaded environment without synchronization overhead.
Efficient and Simple:

Compared to other approaches like double-checked locking or using synchronized methods, Bill Pugh's pattern is more efficient. The double-checked locking pattern can be tricky to implement correctly, and synchronized methods introduce performance overhead. Bill Pugh's approach avoids both these problems by leveraging Java's class loading mechanism.
No Need for Synchronization:

Since the class loader loads the static inner class only when it is referenced, it inherently ensures that the instance is created safely and exactly once without needing synchronization. This makes it more performant than other patterns that rely on synchronization.
Clear Separation of Concerns:

The singleton instance is encapsulated within a static inner class, keeping the implementation clean and separate from the public interface. This adds to the maintainability of the code.
      */
