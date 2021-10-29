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

        for (int x = 0; x < length; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(" *");
            }
            System.out.println();


        }

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

        for (int z = length; z > 0; z--) {
            for (int f = z; f >= 0; f--) {
                System.out.print(" ");
            }
            for (int k = z; k <= length; k++) {

                System.out.print("*");
            }

            System.out.println();
        }
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
        for (int l = length; l >= 0; l--) {

            for (int z = l; z > 0; z--) {
                System.out.print(" *");
            }
            System.out.println();
        }
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
        for (int x = 0; x < length; x++) {

            for (int y = 0; y <= x; y++) {

                System.out.print(" ");
            }
            for (int z = length; z > x; z--) {

                System.out.print("*");

            }
            System.out.println();
        }

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
        for (int x = 0; x <= length; x++) {

            for (int y = length; y > x; y--) {
                System.out.print(" ");
            }
            for (int z = 0; z < x; z++) {
                System.out.print("* ");

            }

            System.out.println();

        }
        for (int x = 0; x <= length; x++) {

            for (int f = 0; f < x; f++) {
                System.out.print(" ");
            }
            for (int j = 3; j > x; j--) {
                System.out.print(" *");

            }

            System.out.println();

        }
        
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

        for (int x = 0; x <= length + 4; x = x + 2) {

            for (int y = length + 4; y > x; y--) {
                System.out.print(" ");
            }
            for (int z = 0; z <= x; z++) {
                System.out.print("* ");

            }
            System.out.println();

        }
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

        for (int x = 0; x <= length + 4; x = x + 2) {


            for (int z = 0; z <= x; z++) {
                System.out.print(" ");

            }
            for (int y = length + 4; y > x; y--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
