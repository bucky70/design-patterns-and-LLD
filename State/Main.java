package State;

public class Main {
    public static void main(String args[]){
        Lion lion=new Lion(new SleepingState());
        lion.observe();
        lion.timePasses();
        lion.observe();

    }
}
