package figureprinter;

public class FigurePrinter {

    public static void main(String[] args) {
        FigurePainter.drawLeftUpTriangle(4);
        System.out.println("_______________________________");
        FigurePainter.drawRightUpTriangle(5);
        System.out.println("_______________________________");
        FigurePainter.drawLeftBottomTriangle(4);
        System.out.println("_______________________________");
        FigurePainter.drawRightBottomTriangle(4);
        System.out.println("_______________________________");
        FigurePainter.drawRhombus(4);
        System.out.println("_______________________________");
        FigurePainter.drawIsoscelesTriangle(5);
        System.out.println("_______________________________");
        FigurePainter.drawBottomIsoscelesTriangle(5);

    }
}