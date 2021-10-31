package figureprinter;

public class FigurePainter {

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *      *
     *      * *
     *      * * *
     *      * * * *
     *
     * @param length  specified length of triangle will be drawn
     */

    public static void drawLeftUpTriangle(int length){
        System.out.println();
        System.out.println("'drawLeftUpTriangle' method ");
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length){
        System.out.println();
        System.out.println("'drawRightUpTriangle' method ");
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
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
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length){
        System.out.println();
        System.out.println("'drawLeftBottomTriangle' method ");
        for (int i = length-1; i >= 0; i--) {
            for (int j = length - 1; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
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
     *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length){
        System.out.println();
        System.out.println("'drawRightBottomTriangle' method ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("  ");
            }
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    /**
     * Draws the rhombus by specified length number
     * for example when n = 5 , it must be such as
     * drawn below :
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        System.out.println();
        System.out.println("'drawRhombus' method ");
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j-- ){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = length - 2; j > i; j-- ){
                System.out.print("* ");
            }

            System.out.println();
        }

    }




    /**
     * lenght = 5
     *            *
     *          * * *
     *        * * * * *
     *      * * * * * * *
     *    * * * * * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawIsoscelesTriangle(int length){
        System.out.println();
        System.out.println("'drawIsoscelesTriangle' method ");
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }

    /**
     *
     *   * * * * * * * * *
     *     * * * * * * *
     *       * * * * *
     *         * * *
     *           *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawBottomIsoscelesTriangle(int length){
        System.out.println();
        System.out.println("'drawBottomIsoscelesTriangle' method ");
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("  ");
            }
            for (int j = length; j > i; j--) {
                System.out.print("* ");
            }
            for (int j = length-1; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
        System.out.println();

    }

}

