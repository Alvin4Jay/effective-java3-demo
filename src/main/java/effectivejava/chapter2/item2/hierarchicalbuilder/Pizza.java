package effectivejava.chapter2.item2.hierarchicalbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 类继承下的Builder模式
 * <p>
 * Note that the underlying "simulated self-type" <code>self()</code> idiom  allows for arbitrary fluid hierarchies,
 * not just builders
 *
 * @author xuanjian
 */
public abstract class Pizza {

    protected final Set<Topping> toppings;

    Pizza(AbstractBuilder<?> builder) {
        this.toppings = builder.toppings.clone(); // 见item50 TODO
    }

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    public abstract static class AbstractBuilder<T extends AbstractBuilder<T>> {

        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public abstract Pizza build();

        /**
         * 子类覆盖本方法，返回this
         *
         * @return 具体的Builder
         */
        protected abstract T self();

    }

}
