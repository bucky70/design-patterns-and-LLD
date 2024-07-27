package Facade;

class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }
}
