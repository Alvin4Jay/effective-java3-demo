package effectivejava.chapter2.item2.hierarchicalbuilder;

/**
 * 继承性的builder子类化
 *
 * @author xuanjian
 */
public class Calzone extends Pizza {

    private final boolean sauceInside;

    public Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return String.format("Calzone with %s and sauce on the %s",
                toppings, sauceInside ? "inside" : "outside");
    }

    public static class Builder extends AbstractBuilder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
