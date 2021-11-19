package overriding;

public class Rectangle extends Figure {

    private int x;
    private int y;


    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
