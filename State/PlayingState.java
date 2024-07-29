package State;

public class PlayingState implements State{

    @Override
    public void observe() {
        System.out.println("lion entered playing state");
    }

    @Override
    public void onEnter() {
        System.out.println("lion entered playing state");
    }
    
}
