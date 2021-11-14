package pizzeriaPalmetto;


public enum PizzaIngredients {
        TOMATO_PASTE(1),
        CHEESE(1),
        SALAMI(1.5),
        BACON(1.2),
        GARLIC(0.3),
        CORN(0.7),
        PEPPERONI(0.6),
        OLIVES(0.5),
        CALZONE(1.50),
        REGULAR(1);

        private final double tomato;
        private final double cheese;
        private final double salami;
        private final double bacon;
        private final double garlic;
        private final double corn;
        private final double pepperoni;
        private final double olives;
        private final double calzone;
        private final double regular;

        PizzaIngredients(double price) {
            this.tomato = price;
            this.cheese = price;
            this.salami = price;
            this.bacon = price;
            this.garlic = price;
            this.corn = price;
            this.pepperoni = price;
            this.olives = price;
            this.calzone = price;
            this.regular = price;
        }

        public double getTomato() {
            return tomato;
        }

        public double getCheese() {
            return cheese;
        }

        public double getSalami() {
            return salami;
        }

        public double getBacon() {
            return bacon;
        }

        public double getGarlic() {
            return garlic;
        }

        public double getCorn() {
            return corn;
        }

        public double getPepperoni() {
            return pepperoni;
        }

        public double getOlives() {
            return olives;
        }

        public double getCalzone() {
            return calzone;
        }

        public double getRegular() {
            return regular;
        }
    }

