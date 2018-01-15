package products.dinner;

import products.Drink;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Tea implements Drink {

    @Override
    public boolean isCold() {
        return false;
    }

    @Override
    public void pour() {
        System.out.println("Tea was poured to cup");
    }
}
