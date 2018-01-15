import factory.BreakfastFactory;
import factory.DinnerFactory;
import factory.FoodFactory;
import factory.LunchFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Anton Mikhaylov on 15.01.2018.
 */
public class Main {

    public static void main(String[] args) {

        List<FoodFactory> factories = Arrays.asList(
                new BreakfastFactory(),
                new LunchFactory(),
                new DinnerFactory()
        );

        factories.stream()
                .map(f -> f.createMeal())
                .forEach(meal -> meal.putIntoPlate());
    }
}
