package products.lunch;

import products.Meal;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Soup implements Meal {

    @Override
    public boolean isHot() {
        return true;
    }

    @Override
    public void putIntoPlate() {
        System.out.println("Soup was poured into plate");
    }
}
