package figureprinter;

public class FigurePainter {

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {

        for (int i = 1; i <= length; i++) {

            for (int j = 1; j <= length - i; i++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {

        for (int i = 0; i < length; i++) {

            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= length - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 1; i < length - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < length - i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * lenght = 5
     * *
     * * * *
     * * * * * *
     * * * * * * * *
     * * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length) {

        for (int i = 0; i <= length; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (int n = 1; n <= 2 * i - 1; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * * * * * * * * * *
     * * * * * * * *
     * * * * * *
     * * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length) {

        for (int i = 1; i <= length; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (length - i) * 2 + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }


    }

}
