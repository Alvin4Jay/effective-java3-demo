package effectivejava.chapter2.item4;

/**
 * Noninstantiable utility class
 *
 * @author xuanjian
 */
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }

    // Remainder omitted...
}
