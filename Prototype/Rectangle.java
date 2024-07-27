package Prototype;

public class Rectangle implements Shape {

    private int width;
    private int length;

    public Rectangle(int width,int length){
        this.width=width;
        this.length=length;
    } 
    public Rectangle(Rectangle target){
        this.width=target.width;
        this.length=target.length;
    } 
    @Override
    public Rectangle cloneShape(){
        return new Rectangle(this);
    }
    @Override
    public void draw() {
       System.out.println("printing width"+ width + "length = "+length);
    }
    
}
