package figureprinter;

public class FigurePainter {
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void drawRightUpTriangle(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length + 1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void drawLeftBottomTriangle(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void drawRightBottomTriangle(int length) {
        for (int i = length; i > 0; i--) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawRhombus(int length) {
        for (int i = length; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length + 1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = length - 2; i > 0; i--) {
            for (int j = length + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void drawIsoscelesTriangle(int length){
        for (int i = 0; i <2*length; i=i+2) {
            for (int k =2*length-1; k > i; k--){
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawBottomIsoscelesTriangle(int length){
        for (int i = 0; i <2*length; i=i+2) {
            for (int k =0; k <= i; k++){
                System.out.print(" ");
            }
            for (int j =2*length-1; j >i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        }
    }










