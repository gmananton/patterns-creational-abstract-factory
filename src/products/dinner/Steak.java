package products.dinner;

import products.Meal;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Steak implements Meal {

    @Override
    public boolean isHot() {
        return true;
    }

    @Override
    public void putIntoPlate() {
        System.out.println("Steak was put onto plate");
    }
}
