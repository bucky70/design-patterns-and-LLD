package practice_area.adapter;

public class main {
 public static void main(String args[]){
    OldCoffeeMachine oldCoffeeMachine=new OldCoffeeMachine();
    NewCoffeeMachineInterface newCoffeeMachine=new NewCoffeeMachineAdaptor(oldCoffeeMachine);
    newCoffeeMachine.printCappucino();
    newCoffeeMachine.printExpresso();
    newCoffeeMachine.normalCoffee();
    newCoffeeMachine.printLatte();
 }
}
