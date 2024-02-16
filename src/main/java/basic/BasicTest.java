package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

    /**
     * return i ^ n for positive Integer, None otherwise
     * alse return None in case of errors
     */
    public static Option<Integer> power(Integer i, Integer n) {
        // Check if is not positive integer
        if (i < 0 || n < 0) {
            return Option.none();
        }

        try {
            if (n == 0) {
                return Option.of(1);
            }

            int value = i;
            for (int j = 1; j < n; j++) {

                // detecting overflow
                if (Integer.MAX_VALUE / i < value) {
                    return Option.none();
                }
                value *= i;
            }

            return Option.of(value);
        } catch (ArithmeticException e) {
            return Option.none();
        }

    }
}
