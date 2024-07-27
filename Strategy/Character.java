package Strategy;

public class Character {
    private String name;
    private int position;
    private MovementStrategy strategy;

    public Character(String name, MovementStrategy strategy) {
        this.name = name;
        this.position = 0; // Initial position
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.move(this);
    }
}
