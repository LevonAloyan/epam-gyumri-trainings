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

        String star = "";
        for (int i = 0; i < length; i++) {
            star += "* ";
            System.out.println(star);
        }
        System.out.println();
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
        String star = "";
        String space = "";
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                space += "  ";
            }
            star += "* ";
            System.out.println(space + star);
            space = "";
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
        String str = "";
        for (int i = 0; i < length; i++){
            for (int j = length ; j > i; j--) {
                str += "* ";
            }
            System.out.println(str);
            str = "";
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
        String space = "";
        for (int i = 0; i < length; i++) {
            String star = "";
            for (int j = length ; j > i; j--) {
                star += "* ";
            }
            space += "  ";
            System.out.println(space + star);
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
        String star1 = "";
        for (int i = 0; i < length; i++) {
            String space1 = "";
            if (i < length -1) {
                for (int j = length - 1; j > i; j--) {
                    space1 += " ";
                }
                star1 += "* ";
                System.out.println(space1 + star1);
            }
        }
        String space2 = " ";
        for (int i = 0; i < length; i++) {
            String star2 = "";
            for (int j = length ; j > i + 2; j--) {
                star2 += "* ";
            }
            space2 += " ";
            System.out.println(space2 + star2);
        }
        System.out.println();
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
        String star = "* ";
        for (int i = 0; i < length; i++) {
            String space = "";
            for (int j = length - 1; j > i; j--) {
                space += "  ";
            }
            System.out.println(space + star);
            star += "* * ";
        }
        System.out.println();
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
        String space = "";
        for (int i = 0; i < length; i++) {
            String star = "* ";
            for (int j = length ; j > i+1; j--) {
                star += "* * ";
            }
            System.out.println(space + star);
            space += "  ";
        }

    }

}
