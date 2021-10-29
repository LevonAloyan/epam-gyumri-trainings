package figureprinter;

public class FigurePrinter {

    public static void main(String[] args) {
        System.out.println("draw left up triangle\n");
        FigurePainter.drawLeftUpTriangle(5);
        System.out.println("draw right up triangle\n");
        FigurePainter.drawRightUpTriangle(5);
        System.out.println("draw left bottom triangle\n");
        FigurePainter.drawLeftBottomTriangle(5);
        System.out.println("draw right bottom triangle\n");
        FigurePainter.drawRightBottomTriangle(5);
        System.out.println("draw rhombus\n");
        FigurePainter.drawRhombus(5);
        System.out.println("draw isosceles triangle\n");
        FigurePainter.drawIsoscelesTriangle(5);
        System.out.println("draw bottom isosceles triangle\n");
        FigurePainter.drawBottomIsoscelesTriangle(5);


    }
}