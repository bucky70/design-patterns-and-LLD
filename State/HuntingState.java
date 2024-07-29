package State;

public class HuntingState implements State{
    @Override
    public void observe() {
        System.out.println("lion entered hunting state");
    }

    @Override
    public void onEnter() {
        System.out.println("lion entered hunting state");
    }
}
