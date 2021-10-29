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
        // TODO : complete the method
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
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
        // TODO : complete the method
        for (int i = 0; i < 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
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
        // TODO : complete the method
        for (int i = 5; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
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
        // TODO : complete the method
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
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
        // TODO : complete the method
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 3; j <= i + 4; j++) {
                System.out.print(" ");
            }
            for (int k = 7; k >= i + 4; k--) {
                System.out.print(" *");
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
    public static void drawIsoscelesTriangle(int length) {
        for (int i = 1; i <=5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleByInga() {

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
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <5 ; j++) {
                System.out.print("*");
            }
            for (int j = i; j <=5 ; j++) {
                System.out.print("*");
            } System.out.println();
        }

    }

}
