package factory;

import products.Dessert;
import products.Drink;
import products.Meal;
import products.lunch.ApplePie;
import products.lunch.Juice;
import products.lunch.Soup;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class LunchFactory implements FoodFactory {

    @Override
    public Meal createMeal() {
        return new Soup();
    }

    @Override
    public Drink createDrink() {
        return new Juice();
    }

    @Override
    public Dessert createDessert() {
        return new ApplePie();
    }
}
