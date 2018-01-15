package products.breakfast;

import products.Meal;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Cereal implements Meal {

    @Override
    public boolean isHot() {
        return false;
    }

    @Override
    public void putIntoPlate() {
        System.out.println("Cereal was put into plate");
    }
}
