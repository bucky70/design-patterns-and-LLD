package State;

public class SleepingState implements State{

    @Override
    public void observe() {
      System.out.println("lion is still in sleeping state");
    }

    @Override
    public void onEnter() {
        System.out.println("lion entered sleeping state");
    }
    
}
