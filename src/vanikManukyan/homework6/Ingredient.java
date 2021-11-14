package vanikManukyan.homework6;

import java.util.Objects;

public class Ingredient {

    private String name;
    private double price;
    private String currency;

    public Ingredient(String name, double price, String currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.price, price) == 0 && name.equals(that.name) && currency.equals(that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, currency);
    }
}
