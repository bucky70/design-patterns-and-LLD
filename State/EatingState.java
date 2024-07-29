package State;

public class EatingState implements State{

    @Override
    public void observe() {
        System.out.println("lion entered eating state");
    }

    @Override
    public void onEnter() {
        System.out.println("lion entered eating state");
    }

}
