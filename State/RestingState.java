package State;

public class RestingState implements State{

    @Override
    public void observe() {
        System.out.println("lion entered resting state");
    }

    @Override
    public void onEnter() {
        System.out.println("lion entered resting state");
    }
    
}
