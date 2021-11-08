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

        for (int i = 0; i <=4; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }
            System.out.println( );
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

        for (int i = 0; i <=5; i++) {

            for (int j = 1; j <=5-i ; j++) {

                System.out.print(" ");
                
            }
            for (int k = 1; k <= i ; k++) {

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

        for (int i = 0; i <= 4; i++) {

            for (int j = i; j < 4; j++) {

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
        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= 4-i; j++) {

                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {

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
        for (int i = 5; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print(" ");

            }
            for (int k = 0; k <= ((5-i)*2) ; k++) {

                System.out.print("*");

            }
            for (int v = i; v <= i ; v++) {

                System.out.print(" ");

            }

            System.out.println();

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

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(" ");

            }

            for (int k = 0; k <= ((5-i)*2) ; k++) {

                System.out.print("*");

            }

            for (int v = i; v <= i ; v++) {

                System.out.print(" ");

            }

            System.out.println();

        }

    }

}
