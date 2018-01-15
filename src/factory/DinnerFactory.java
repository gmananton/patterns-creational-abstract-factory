package factory;

import products.Dessert;
import products.Drink;
import products.Meal;
import products.dinner.IceCream;
import products.dinner.Steak;
import products.dinner.Tea;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class DinnerFactory implements FoodFactory {

    @Override
    public Meal createMeal() {
        return new Steak();
    }

    @Override
    public Drink createDrink() {
        return new Tea();
    }

    @Override
    public Dessert createDessert() {
        return new IceCream();
    }
}
