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
        for (int i = 0; i < length; i++ ){
            for(int j = 0; j <= i; j++ ){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
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
        for (int i = 0; i < length; i++ ){
            for(int j = length - 1; j >= i; j-- ){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println(" ");
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
        for (int i = 0; i < length; i++ ){
            for(int j = i; j < length; j++ ){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
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
        for (int i = 0; i < length; i++ ){
            for (int j = 0; j < length; j++){
                if(i <= j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
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
//        int n = length - 1;
//        for (int i = 0; i < n *2 - 1; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
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
        for (int i = 0; i < length * 2; i++ ){
            if(i % 2 == 0){
                for(int j = length * 2; j >= i; j-- ){
                    System.out.print(" ");
                }
                for(int j = 0; j <= i; j++ ){
                    System.out.print("* ");
                }
                System.out.println(" ");
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
        for (int i = 0; i < length * 2; i++ ){
            if(i % 2 != 0){
                for (int j = 0; j < length * 2; j++){
                    if(i <= j){
                        System.out.print(" *");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }


    }

}
