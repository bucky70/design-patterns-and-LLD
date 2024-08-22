package practice_area.prototype;

public class Main {
  public static void main(String args[]){
    Laptop laptop1=new Laptop(8,512,"ryzen");
    Laptop laptop2=laptop1.getClone();
    System.out.println(laptop1+" "+laptop2);
  }
}
