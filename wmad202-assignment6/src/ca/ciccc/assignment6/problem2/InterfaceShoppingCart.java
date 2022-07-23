package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.Product;

import java.util.ArrayList;

public interface InterfaceShoppingCart {

    Integer addItem(Product product);

    void displayProduct();

    void setShippingCart(ArrayList<Product> shippingCart);

    void setTotalPrice(Float TotalPrice);

    Float getPrice(ArrayList<Product> shoppingCart);
}
