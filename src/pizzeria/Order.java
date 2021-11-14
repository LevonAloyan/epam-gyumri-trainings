package pizzeria;

import java.time.LocalDateTime;

public class Order {
    private static int ORDER_NUM = 10000;
    private static int CONSUMER_NUM = 10000;

    private final Pizza pizza;
    private final Consumer consumer;
    private final int orderNum;
    private final LocalDateTime localDateTime;




    public Order(Pizza pizza, Consumer consumer) {
        this.localDateTime = LocalDateTime.now();
        this.orderNum = ++ORDER_NUM;
        this.pizza = pizza;
        this.pizza.setPizzaNum(orderNum);
        checkPizzaName(pizza.getPizzaName());


        this.consumer = consumer;
        this.consumer.setConsumerNum(++CONSUMER_NUM);
    }

    private void checkPizzaName(String name) {
        if (pizza.getPizzaName().endsWith("_")) {
            pizza.setPizzaName(pizza.getPizzaName() + pizza.getPizzaNum());
        }
    }

    public void viewOrder() {
        System.out.println("Номер закза: [" + getOrderNum() + "]" + "\n" +
                "Клиент: " + consumer.getName() + "[" + consumer.getConsumerNum() + "]" + "\n" +
                //count????
                "Имя пиццы: " + pizza.getPizzaName() + "[" + pizza.getPizzaNum() + "]" +
                "Колличество: " + pizza.getCount());
    }


    public void printCheck() {
        System.out.println("*******" + "\n" +
                "Дата заказа: "+ localDateTime +"\n"+
                "Заказ: " + orderNum + "\n" +
                "Клиент:  " + consumer.getConsumerNum() + "\n" +
                "Имя пиццы: " + pizza.getPizzaName() + "\n" +
                "-------" + "\n" +
                "---" + "\n" +
                "Ингредиенты пиццы:" + "\n" +
                "Тип пиццы: " + pizza.getType());
        String[] str = pizza.getIngredient();
        for (String s : str) {
            if (s != null) {
                System.out.println(s + " $");
            }
        }
        System.out.println("-------" + "\n" +
                "---" + "\n" +
                "Сумма: " + pizza.getPrice() + " $\n" +
                "Колличество: " + pizza.getCount() + "шт." + "\n" +
                "Общая сумма заказа: " + (pizza.getPrice() * pizza.getCount())+" $\n");

    }
    public int getOrderNum() {
        return orderNum;
    }
}

