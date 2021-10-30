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
        for (int i = 0; i < length; i++) {
            System.out.println("  ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
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
        for (int i = length; i > 0; i--) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length; j >= i; j--) {
                System.out.print(" " + "*");
            }
        }

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
        for (int i = 0; i < length; i++) {
            System.out.println("  ");
            for (int j = 4; j >= i; j--) {
                System.out.print("*" + " ");
            }
        }
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
        for (int i = length; i > 0; i--) {
            System.out.println();
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
        }
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
        for (int i = length; i > 0; i--) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j > i; j--) {
                System.out.print(" " + "*");
            }
        }
        for (int i = length; i > 0; i--) {
            System.out.println(" ");
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*");
            }
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
        length *= 2;
        for (int i = length; i >= 0; i--) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j > i; j--) {
                if (i%2 == 1) {
                    System.out.print(" " + "*");
                }
            }
        }
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
        length *= 2;
        for (int i = length; i >= 0; i--) {
            System.out.println(" ");
            for (int j = length; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (i%2 == 1) {
                    System.out.print(" " + "*");
                }
            }
        }
    }

}
