package vanikManukyan.homework6;

public class PizzaOrderType {
  private Pizza pizza ;
  private int quantity;
  private String name;

  public PizzaOrderType(Pizza pizza, int quantity, String name) {
    this.pizza = pizza;
    this.quantity = quantity;
    this.name = name;
  }

  public Pizza getPizza() {
    return pizza;
  }

  public void setPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
