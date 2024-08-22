public class Dog implements Animal{

    @Override
    public void speak() {
       System.out.println("dog speaks bow");
    }

    @Override
    public void walk() {
        System.out.println("dog takes a walk");
    }
    
}
