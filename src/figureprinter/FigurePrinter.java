package figureprinter;

public class FigurePrinter {

    public static void main(String[] args) {
        FigurePainter.drawLeftUpTriangle(4);
        System.out.println("____________________________________________");
        FigurePainter.drawRightUpTriangle(5);
        System.out.println("____________________________________________");
        FigurePainter.drawLeftBottomTriangle(4);
        System.out.println("____________________________________________");
        FigurePainter.drawRightBottomTriangle(4);
        System.out.println("____________________________________________");
        FigurePainter.drawRhombus(4);
        System.out.println("____________________________________________");
        FigurePainter.drawIsoscelesTriangle(5);
        System.out.println("____________________________________________");
        FigurePainter.drawBottomIsoscelesTriangle(5);
    }
}