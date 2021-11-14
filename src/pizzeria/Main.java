package pizzeria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String consumerName;
        String[] ingredientArray = new String[8];
        String type;
        String pizzaName;
        int pizzaCount;


        boolean isRun = true;
        while (isRun) {


            System.out.println("Вас приветствует пиццерия <<Palmetto>>!!!");
            System.out.println("Введите Ваше имя");
            consumerName = scanner.nextLine();

            {
                System.out.println("Тип пиццы по умолчанию: BASIC, хотите изменить на CALZONE? Y/N");
                String yesOrNo;
                yesOrNo = scanner.nextLine();
                if (yesOrNo.equalsIgnoreCase("Y")) {
                    type = "CALZONE";
                } else {
                    type = "BASIC";
                    System.out.println("Выбрано значение по умолчанию BASIC");
                }
            }
            {
                System.out.println("Вы можете выбрать до 8 ингредиентов");
                int index = 0;
                for (int i = 0; i < Pizza.ingredientsList.length; i++) {
                    String yesOrNo;

                    System.out.println("Добавить в пиццу " + Pizza.ingredientsList[i] + "$ ? Y/N");
                    yesOrNo = scanner.nextLine();

                    if (yesOrNo.equalsIgnoreCase("y")) {
                        ingredientArray[index++] = Pizza.ingredientsList[i];
                    }
                }
                //System.out.println(Arrays.toString(ingredientArray));

            }

            System.out.println("Напишите имя вашей пицце (От 4 до 20 букв)");
            pizzaName = scanner.nextLine();

            System.out.println("Сколько штук Вы хотите заказать? ");
            pizzaCount = scanner.nextInt();

            System.out.println("Ваш заказ принят! Проверьте");

            Pizza pizza = new Pizza();
            Consumer consumer = new Consumer();

            consumer.setName(consumerName);

            pizza.setType(type);
            pizza.setCount(pizzaCount);
            pizza.setIngredient(ingredientArray);
            if (pizzaName.length() > 4 && pizzaName.length() < 20) {
                pizza.setPizzaName(pizzaName);
            } else {
                pizza.setPizzaName(consumerName + "_");
            }

            Order order = new Order(pizza, consumer);
            order.viewOrder();
            {
                String yesOrNo;
                scanner.nextLine();
                System.out.println("Хотите изменить список ингредиентов? Y/N");
                yesOrNo = scanner.nextLine();
                if (yesOrNo.equalsIgnoreCase("Y")) {
                    String[] newIngredient = new String[8];
                    int freeSize = pizza.checkIngredientList();
                    if (freeSize < 8) {
                        int step = 0;
                        int index = 0;
                        String[] checkArray = pizza.getIngredient();
                       // System.out.println(Arrays.toString(checkArray));

                        for (String s : Pizza.ingredientsList) {
                            if (s.equals(checkArray[index])) {
                                System.out.println("В  Вашей пицце уже есть " + s);
                                index++;
                            } else {
                                String choice;
                                System.out.println("Добавить в пиццу " + s + "$ ? Y/N");
                                choice = scanner.nextLine();
                                if (choice.equalsIgnoreCase("y")) {
                                    newIngredient[step++] = s;
                                }
                            }
                        }
                        pizza.addIngredient(newIngredient, freeSize);
                    }
                }
            }
            {
                System.out.println("Хотите просмотреть детально Ваш заказ? Y/N");
                String yesOrNo;
                yesOrNo = scanner.nextLine();
                if (yesOrNo.equalsIgnoreCase("Y")) {
                    order.printCheck();
                }

                System.out.println("Приятного аппетита!");
            }
            isRun = false;

        }

    }

}
