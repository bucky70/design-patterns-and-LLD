package Strategy;

public class FlyingStrategy implements MovementStrategy {
    @Override
    public void move(Character character) {
        character.setPosition(character.getPosition() + 5);
        System.out.println(character.getName() + " is flying. New position: " + character.getPosition());
    }
}