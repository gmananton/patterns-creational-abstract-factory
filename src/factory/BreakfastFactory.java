package factory;

import products.Dessert;
import products.Drink;
import products.Meal;
import products.breakfast.Cereal;
import products.breakfast.Coffee;
import products.breakfast.Pancake;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class BreakfastFactory implements FoodFactory {

    @Override
    public Meal createMeal() {
        return new Cereal();
    }

    @Override
    public Drink createDrink() {
        return new Coffee();
    }

    @Override
    public Dessert createDessert() {
        return new Pancake();
    }
}
