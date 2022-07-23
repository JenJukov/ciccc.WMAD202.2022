package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.*;

import java.util.ArrayList;

public class Problem2 {
    public void invoke() {
        /*
        Product p = new Product();
        p.setId(1);
        p.getId();
        p.setMadeInCountry("CA");
        p.getMadeInCountry();
        p.setName("COCA-COLA");
        p.getName();
        p.setPrice(12F);
        p.getPrice();

        System.out.println(p.getName());

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(p);
        shoppingCart.displayProduct();
        */
        Product product = new Product(110,"Diet Pepsi",2F,"USA");

        Drink drink1 = new Drink();
        drink1.setId(412);
        drink1.setName("Pepsi");
        drink1.setPrice(2F);
        drink1.setMadeInCountry("USA");
        drink1.setDrinkDiet(false);
        drink1.setDrinkSize(150);

        Drink drink2;
        drink2 = new Drink();
        drink2.setId(183);
        drink2.setName("Ginger Zero");
        drink2.setPrice(3F);
        drink2.setMadeInCountry("Canada");
        drink2.setDrinkDiet(true);
        drink2.setDrinkSize(200);

        ArrayList<String> ingredients1 = new ArrayList<>();
        ingredients1.add("chicken");
        ingredients1.add("oil");
        ingredients1.add("cheese");

        Food food1 = new Food(101, "Pasta", 18F, "Canada", ingredients1, 4, 250);
        food1.setId(100);
        food1.setName("Chicken");
        food1.setPrice(8F);
        food1.setMadeInCountry("Canada");
        food1.setIngredients(ingredients1);
        food1.setFoodSize(4);
        food1.setFoodCalories(350);

        ArrayList<String> ingredients2 = new ArrayList<>();
        ingredients2.add("pasta");
        ingredients2.add("meet");
        ingredients2.add("spinach");
        Food food2 = new Food(101,"Pasta",18F,"Canada", ingredients2,4,250);

        Material material1 = new Material(10,"Cotton");
        Material material2 = new Material(11,"Nylon");
        ArrayList<Material> materials = new ArrayList<>();
        materials.add(material1);
        materials.add(material2);
        Cloth cloth = new Cloth(701,"T-shirt",15F,"China",materials);

        ShoppingCart shoppingCart =  new ShoppingCart();
        //amount 2
        Integer savedProduct1 = shoppingCart.addItem(drink1);
        System.out.println("product id : " + savedProduct1 + " is saved!");
        Integer savedProduct2 = shoppingCart.addItem(drink1);
        System.out.println("product id : " + savedProduct2 + " is saved!");
        //1
        Integer savedProduct3 = shoppingCart.addItem(drink2);
        System.out.println("product id : " + savedProduct3 + " is saved!");
        //2
        Integer savedProduct4 = shoppingCart.addItem(food1);
        System.out.println("product id : " + savedProduct4 + " is saved!");
        Integer savedProduct5 = shoppingCart.addItem(food1);
        System.out.println("product id : " + savedProduct5 + " is saved!");
        //2
        Integer savedProduct6 = shoppingCart.addItem(food2);
        System.out.println("product id : " + savedProduct6 + " is saved!");
        Integer savedProduct7 = shoppingCart.addItem(food2);
        System.out.println("product id : " + savedProduct7 + " is saved!");
        //1
        Integer savedProduct8 = shoppingCart.addItem(cloth);
        System.out.println("product id : " + savedProduct8 + " is saved!");

        System.out.println("List of product on your shopping chart : ");
        shoppingCart.displayProduct();


        Float totalAmount = shoppingCart.totalPrice;
        System.out.println("Shopping Cart Total price : " + totalAmount + "$");



    }
}
