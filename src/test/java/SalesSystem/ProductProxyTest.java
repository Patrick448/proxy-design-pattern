package SalesSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductProxyTest {

    @BeforeEach
    void init(){
        BD.getInstance().clear();
    }

    @Test
    void deveRetornarQuantidade(){
        BD.getInstance().addProduct(new Product(0, 1, "Produto 1", 10.0f));
        ProductProxy product = new ProductProxy(0);
        assertEquals(1, product.getQuantity());
    }

    @Test
    void deveRetornarNome(){
        BD.getInstance().addProduct(new Product(23, 1, "Produto 1", 10.0f));
        ProductProxy product = new ProductProxy(23);
        assertEquals("Produto 1", product.getName());
    }

    @Test
    void deveRetornarPreco(){
        BD.getInstance().addProduct(new Product(10, 1, "Produto 1", 10.0f));
        ProductProxy product = new ProductProxy(10);
        assertEquals(10.0f, product.getPrice());
    }

}