package stack;

public class Main {
    public static void main(String[] args) {
        Palmetto palmetto = new Palmetto();
        Ordered ordered = new Ordered();
        Ordered ordered2 = new Ordered();

        ordered.pizza("Mar", Palmetto.type.closedCalzone, 5, 254, "Narek");

        ordered.orderdAttribute(56, "Mar", 54, "Anna");
    }

}
