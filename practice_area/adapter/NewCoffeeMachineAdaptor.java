package practice_area.adapter;

public class NewCoffeeMachineAdaptor implements NewCoffeeMachineInterface{

    private OldCoffeeMachine oldCoffeeMachine;
    public NewCoffeeMachineAdaptor(OldCoffeeMachine oldCoffeeMachine){
        this.oldCoffeeMachine=oldCoffeeMachine;
    }
    @Override
    public void normalCoffee() {
       System.out.println("print normal coffee from new machine");
    }

    @Override
    public void printCappucino() {
        System.out.println("print Cappucino coffee from new machine");
    }
    public void printExpresso(){
        oldCoffeeMachine.printExpresso();
    }
    public void printLatte(){
        oldCoffeeMachine.printLatte();
    }
    
}
