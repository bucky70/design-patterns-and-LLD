package problems.easy.vendingmachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import problems.easy.vendingmachine.products.Product;

public class Inventory {//shoyld import be static 
    private final Map<Product,Integer> products;

    public Inventory(){
        products=new ConcurrentHashMap<>();
    }

    //addproducts -product,quantity
    

    //update products quantity

    //isProductAvailable

    //remove products

    //getquantity for product
}
