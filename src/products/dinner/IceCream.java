package products.dinner;

import products.Dessert;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class IceCream implements Dessert {

    @Override
    public boolean isSweet() {
        return true;
    }

    @Override
    public boolean isGoodWithTea() {
        return false;
    }
}
