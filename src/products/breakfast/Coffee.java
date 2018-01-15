package products.breakfast;

import products.Drink;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Coffee implements Drink {

    @Override
    public boolean isCold() {
        return false;
    }

    @Override
    public void pour() {
        System.out.println("Coffee was poured to cup");
    }
}
