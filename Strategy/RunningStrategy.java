package Strategy;

public class RunningStrategy implements MovementStrategy {
    @Override
    public void move(Character character) {
        character.setPosition(character.getPosition() + 3);
        System.out.println(character.getName() + " is running. New position: " + character.getPosition());
    }
}