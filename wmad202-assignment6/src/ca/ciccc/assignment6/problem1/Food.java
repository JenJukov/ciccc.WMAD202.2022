package ca.ciccc.assignment6.problem1;

import java.util.ArrayList;

public class Food extends Product {
    private Integer foodCalories;
    private Integer foodSize;
    private ArrayList<String> foodIngredients;

    public Food(int id, String hamburguer, float price, String brazil, int i, int size, String[] strings) {
    }

    public Food(Integer id, String name, Float price, String madeInCountry, ArrayList<String> ingredients, Integer size, Integer calorie) {
        super(id, name, price, madeInCountry);
        this.foodIngredients = ingredients;
        this.foodSize = size;
        this.foodCalories = calorie;
    }

    public ArrayList<String> getIngredients(ArrayList<String> foodIngredients) {
        return foodIngredients;
    }

    public void setIngredients(ArrayList<String> ingredients1) {
        this.foodIngredients = ingredients1;
    }

    public Integer getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(Integer size) {
        foodSize = size;
    }

    public Integer getFoodCalories() {
        return foodSize;
    }

    public void setFoodCalories(Integer Calories) {
        foodCalories = Calories;
    }
}
