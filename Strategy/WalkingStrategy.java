package Strategy;

public class WalkingStrategy implements MovementStrategy {
    @Override
    public void move(Character character) {
        character.setPosition(character.getPosition() + 1);
        System.out.println(character.getName() + " is walking. New position: " + character.getPosition());
    }
}