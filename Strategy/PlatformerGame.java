package Strategy;

public class PlatformerGame {
    public static void main(String[] args) {
        Character character = new Character("Hero", new WalkingStrategy());

        character.move(); // Hero is walking. New position: 1
        character.setStrategy(new RunningStrategy());
        character.move(); // Hero is running. New position: 4
        character.setStrategy(new FlyingStrategy());
        character.move(); // Hero is flying. New position: 9
    }
}
