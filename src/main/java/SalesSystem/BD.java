package SalesSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BD {

    private static BD instance = new BD();
    private HashMap<Integer, Product> products = new HashMap<>();

    private BD(){

    }

    public static BD getInstance(){
        return instance;
    }

    public void addProduct(Product product){
        products.put(product.getId(), product);
    }

    public Product getProduct(int id){
        return products.get(id);
    }

    public void clear(){
        products.clear();
    }
}
