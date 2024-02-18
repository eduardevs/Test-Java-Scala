package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


    /**
     * operation : x -> ((x * 2) + 3) ^ 5
     */
    public static List<Double> compute1(List<Integer> input) {
        List<Double> results = new ArrayList<>();

        for (Integer x : input) {
            // Add to the result list
            double result = Math.pow((x * 2) + 3, 5);
            results.add(result);
        }

        return results;
    }

    /**
     * operation : abc -> AbcAbc
     */
    public static List<String> compute2(List<String> input) {
        List<String> results = new ArrayList<>();

        for (String str : input) {
            // Vérifier les chaines de caractères
            if (str != null && !str.isEmpty()) {
                String transformed = str.substring(0, 1).toUpperCase() + str.substring(1);
                transformed += transformed; // Duplicate the transformed string
                results.add(transformed); // Add to results
            } else {
                results.add(str);
            }
        }
        return results;
    }
}


