package pizzeria;

public class OrderItem {

    private Pizza pizza;
    private int count;

    public  OrderItem(Pizza pizza,int count){
        this.pizza = pizza;
        this.count = countCheck(count);
    }

    public static OrderItem addOrderItem(Pizza pizza,int count){
        return new OrderItem(pizza,count);
    }

    public int countCheck(int count){
        this.count = count;
        if (count > 10 || count < 1){
            System.out.println(COUNT_IS_MORE);
            return 0;
        }
        return count;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getCount() {
        return count;
    }

}
