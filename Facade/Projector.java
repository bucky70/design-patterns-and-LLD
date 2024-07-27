package Facade;

class Projector {
    public void on() {
        System.out.println("Projector is on");
    }

    public void setInput(String input) {
        System.out.println("Setting projector input to " + input);
    }
}