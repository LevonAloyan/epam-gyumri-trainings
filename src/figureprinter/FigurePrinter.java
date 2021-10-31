package figureprinter;

public class FigurePrinter {

    public static void main(String[] args) {
        FigurePainter.drawLeftUpTriangle(4);
        System.out.println();
        FigurePainter.drawRightUpTriangle(7);
        FigurePainter.drawRhombus(4);
        System.out.println();
        FigurePainter.isoscelesTriangle(4);
        System.out.println();
        FigurePainter.drawRightButtomTriangle(5);
        System.out.println();
        FigurePainter.drawLeftButtomTriangle(5);
        System.out.println();
        FigurePainter.drawBottomIsoscelesTriangle(7);


    }
}