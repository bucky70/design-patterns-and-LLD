package State;

public class Lion {
    private State state;
    public Lion(State state){
        this.state=state;
    }
    public State getState(){
        return this.state;
    } 
    public void changeState(State state){
        this.state=state;
    }
    //here we change state which is not available in strategy, also each state is either connected lineraly or aware of next state
    public void timePasses(){
        if(this.state.getClass().equals(PlayingState.class)){
           changeState(new SleepingState());
        }
        else if(this.state.getClass().equals(HuntingState.class)){
            changeState(new EatingState());
        }
        else if(this.state.getClass().equals(SleepingState.class)){
            changeState(new PlayingState());
        }
    }
    public void observe(){
        this.state.observe();
    }
}
