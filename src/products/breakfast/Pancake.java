package products.breakfast;

import products.Dessert;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Pancake implements Dessert {

    @Override
    public boolean isSweet() {
        return true;
    }

    @Override
    public boolean isGoodWithTea() {
        return true;
    }
}
