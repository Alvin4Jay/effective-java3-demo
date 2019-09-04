package effectivejava.chapter2.item2.hierarchicalbuilder;

import java.util.Objects;

/**
 * 继承性的builder子类化
 *
 * @author xuanjian
 */
public class NyPizza extends Pizza {

    private final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "New York Pizza with " + toppings + ", size: " + size.name();
    }

    public enum Size {SMALL, NORMAL, LARGE}

    public static class Builder extends AbstractBuilder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }
}
