package problems.easy.vendingmachine.products;

public class Product {
    private int price;
    private String name;
    public Product(int price, String name){
        this.price=price;
        this.name=name;

    }
    public String getNmae(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
