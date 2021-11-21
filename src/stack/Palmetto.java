package stack;

public class Palmetto {
    static final int order = 10000 + (int)(Math.random() * 99999);
    String pizzaName;
    int quantity;
    double cheese;
    double tomatoPaste;
    double salami;
    double bacon;
    double garlic;
    double corn;
    double pepperoni;
    double olives;
    double base_reg;
    double base_cl;

    public  enum type {
        closedCalzone,
        regular
    };

    {
        cheese = 1;
        tomatoPaste = 1;
        salami = 1.5;
        bacon = 1.2;
        garlic = 0.3;
        corn = 0.7;
        pepperoni = 0.6;
        olives = 0.5;
        base_reg = 1;
        base_cl = 1.5;
    }



     public static int getQuantity (int quantity1) {
        if (quantity1 <= 10) {
           return quantity1;
        }
        else {
            return -1;
        }
    }

}
