package products.lunch;

import products.Drink;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Juice implements Drink {

    @Override
    public boolean isCold() {
        return true;
    }

    @Override
    public void pour() {
        System.out.println("Juice was poured to glass");
    }
}
