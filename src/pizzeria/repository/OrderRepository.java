package pizzeria.repository;

import pizzeria.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private final List<Order> orderList = new ArrayList<>();
    private int anInt = 7;


    public void save(Order order) {
        order.setOrderNum(anInt++);
        orderList.add(order);
    }

    public List<Order> getAll() {
        return new ArrayList<>(orderList);
    }
}