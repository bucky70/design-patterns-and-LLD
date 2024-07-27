package Prototype;

public class Main {
   public static void main(String args[]){
    Shape circle=new Circle(10);
    Shape circle2=circle.cloneShape();
    System.out.println(circle+" "+circle2);
   }
}
