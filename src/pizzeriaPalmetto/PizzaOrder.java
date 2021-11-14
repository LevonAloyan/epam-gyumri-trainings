package pizzeriaPalmetto;

public class PizzaOrder {
    private int orderId;
    private int customerId;
    private String pizzaName;
    private int quantity;

    public PizzaOrder(int orderId, int customerId, String pizzaName, int quantity) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.pizzaName = pizzaName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", pizzaName='" + pizzaName + '\'' +
                '}';
    }

    public void displaying(){
        System.out.println("["+orderId+":"+customerId+":"+pizzaName+":"+quantity+"]");;
    }
}
