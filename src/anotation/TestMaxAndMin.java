package anotation;

public class TestMaxAndMin {
    private int num1;
    private int num2;
    private int discountRate;

    public TestMaxAndMin(int num1, int num2, int discountRate) {
        this.num1 = num1;
        this.num2 = num2;
        this.discountRate = discountRate;
    }

    public String isMaxMin () {
        if (discountRate == num1) {
            return "min is " + discountRate;
        }
        else if (discountRate == num2) {
            return "max is " + discountRate;
        }
        else if (discountRate > num1 && discountRate < num2) {
            return "discountrate is " + discountRate;
        }
        return null;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
