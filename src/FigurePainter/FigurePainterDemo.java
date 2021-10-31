package FigurePainter;

public class FigurePainterDemo {
    public static void main(String[] args) {
        System.out.println("Figure 1");
        FigurePainter.drawLeftUpTriangle(4);
        System.out.println();
        System.out.println("Figure 2");
        FigurePainter.drawRightUpTriangle(4);
        System.out.println();
        System.out.println("Figure 3");
        FigurePainter.drawLeftBottomTriangle(4);
        System.out.println();
        System.out.println("Figure 4");
        FigurePainter.drawRightBottomTriangle(4);
        System.out.println();
        System.out.println("Figure 5");
        FigurePainter.drawRhombus(4);
        System.out.println();
        System.out.println("Figure 6");
        FigurePainter.drawIsoscelesTriangle(5);
        System.out.println();
        System.out.println("Figure 7");
        FigurePainter.drawBottomIsoscelesTriangle(9);

    }
}
