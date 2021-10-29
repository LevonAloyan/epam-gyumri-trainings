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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("x ");

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
        System.out.println("method draw right up triangle");
        for (int i = 0; i < length; i++) {
            for (int j = length; j >i ; j--) {
                System.out.print (" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("x");

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
        System.out.println("method draw left bottom triangle");
        for (int i = length; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print ("x");

            }
            for (int j = length; j < i; j--) {
                System.out.print(" ");

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
        System.out.println("method draw right bottom tiangle");
        // TODO : complete the method
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j <length; j++) {
                System.out.print("x");

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
        System.out.println("method draw rhombus");

        // TODO : complete the method
        for (int i = 0; i < length; i++) {
            for (int j = length; j >i ; j--) {
                System.out.print (" ");

            }
            for (int j = 0; j <i; j++) {
                System.out.print("x ");

            }
            System.out.println();

        }
        for (int i = 0; i <length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j <length; j++) {
                System.out.print("x ");

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
        System.out.println("method drawIsoscelesTriangle");
        for (int i = 0; i < length; i++) {
            for (int j = length; j >i ; j--) {
                System.out.print (" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("x ");

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
        System.out.println("methor drawBottomIsoscelesTriangle");
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j <length; j++) {
                System.out.print("x ");

            }
            System.out.println();

        }

    }

}
