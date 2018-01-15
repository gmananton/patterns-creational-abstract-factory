package factory;

import products.Dessert;
import products.Drink;
import products.Meal;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public interface FoodFactory {
    Meal createMeal();
    Drink createDrink();
    Dessert createDessert();
}
