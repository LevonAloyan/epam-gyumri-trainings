package figureprinter;

public class FigurePrinter {

    public static void main(String[] args) {
       FigurePainter.drawLeftUpTriangle(4);
       System.out.println("===================");
       FigurePainter.drawRightUpTriangle(4);
       System.out.println("===================");
       FigurePainter.drawLeftBottomTriangle(4);
       System.out.println("===================");
       FigurePainter.drawRightBottomTriangle(4);
       System.out.println("===================");
       FigurePainter.drawIsoscelesTriangle(4);
       System.out.println("===================");
       FigurePainter.drawBottomIsoscelesTriangle(4);
       System.out.println("===================");
       FigurePainter.drawRhombus(4);
    }
}