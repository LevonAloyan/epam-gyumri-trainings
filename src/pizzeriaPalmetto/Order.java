package pizzeriaPalmetto;

public class Order {
    private int orderNumber;
    private int cotumerNumber;
    private Pizza pizza;


    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", cotumerNumber=" + cotumerNumber +
                ", pizza=" + pizza +
                '}';
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCotumerNumber(int cotumerNumber) {
        this.cotumerNumber = cotumerNumber;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }



    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCotumerNumber() {
        return cotumerNumber;
    }

    public Pizza getPizza() {
        return pizza;
    }





    public Order(int orderNumber, int cotumerNumber, Pizza pizza, int quantity) {
        this.orderNumber = orderNumber;
        this.cotumerNumber = cotumerNumber;
        this.pizza = pizza;


    }


}
