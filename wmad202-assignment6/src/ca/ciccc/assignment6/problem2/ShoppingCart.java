package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.*;

import java.util.ArrayList;

public class ShoppingCart implements InterfaceShoppingCart {
    public Float totalPrice;
    public ArrayList<Product> ShippingCart = new ArrayList<>();

    public ShoppingCart() {
        this.ShippingCart = new ArrayList<Product>();
    }

    @Override
    public Integer addItem(Product product) {
        this.ShippingCart.add(product);
        return product.getId();
    }

    @Override
    public void displayProduct() {
        for(Product product: this.ShippingCart) {
            System.out.println(product.getName());
        }
    }

    @Override
    public void setShippingCart(ArrayList<Product> shippingCart) {
        ShippingCart = shippingCart;
    }

    @Override
    public void setTotalPrice(Float TotalPrice) {
        totalPrice = TotalPrice;
    }

    @Override
    public Float getPrice(ArrayList<Product> shoppingCart) {
        Float total = 0F;
        for (Product p: ShippingCart) {
            total += p.getPrice();
        }
        return total;
    }

}