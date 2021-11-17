package pizzeria;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
public class Order {

    private int clientNum;
    private int orderNum;
    private List<Pizza> pizzas;
    private LocalDateTime time;

    public Order(int clientNum, List<Pizza> pizzas) {
        this.clientNum = clientNum;
        this.pizzas = pizzas;
    }
}