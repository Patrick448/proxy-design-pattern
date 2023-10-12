package SalesSystem;

public class ProductProxy implements IProduct{

    private Product product;
    private int id;


    public ProductProxy(int id){
        this.id = id;
    }

    @Override
    public int getQuantity() {
        if(product == null){
            product = BD.getInstance().getProduct(this.id);
        }

        return product.getQuantity();
    }

    @Override
    public String getName() {
        if(product == null){
            product = BD.getInstance().getProduct(this.id);
        }

        return product.getName();
    }

    @Override
    public float getPrice() {
        if(product == null){
            product = BD.getInstance().getProduct(this.id);
        }
        return product.getPrice();
    }
}
