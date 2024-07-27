package Prototype;

public class Circle implements Shape{

    private int radius;
    
    public Circle(int radius){
        this.radius=radius;
    }
    public Circle(Circle target){
        this.radius=target.radius;
    }
    @Override
    public void draw() {
       System.out.println("drawing circle with radius: "+radius);
    }

    @Override
    public Shape cloneShape() {
       return new Circle(this);
    }
    
}
