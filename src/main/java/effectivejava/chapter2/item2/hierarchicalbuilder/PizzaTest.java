package effectivejava.chapter2.item2.hierarchicalbuilder;

import static effectivejava.chapter2.item2.hierarchicalbuilder.NyPizza.Size.SMALL;
import static effectivejava.chapter2.item2.hierarchicalbuilder.Pizza.Topping.HAM;
import static effectivejava.chapter2.item2.hierarchicalbuilder.Pizza.Topping.MUSHROOM;
import static effectivejava.chapter2.item2.hierarchicalbuilder.Pizza.Topping.PEPPER;

/**
 * 继承性的builder子类化 测试
 *
 * @author xuanjian
 */
public class PizzaTest {
    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(MUSHROOM)
                .addTopping(PEPPER).build();

        Calzone calzone = new Calzone.Builder().sauceInside().addTopping(HAM).build();

        System.out.println(nyPizza);
        System.out.println(calzone);

    }
}
