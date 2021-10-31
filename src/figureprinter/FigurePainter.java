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
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j<=i; j++) {
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
        for( int i=1; i <=length; i++){
            for(int j=length; j>i; j-- ){
                System.out.print("  ");
            }
            for( int k =1; k<=i; k++){
                System.out.print("* ");
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
       for (int i= 1; i<=length; i++){
           for ( int j= length; j>=i; j--){
               System.out.print("* ");
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
       for(int i=1; i<=length; i++){
           for(int j=1; j<i; j++){
               System.out.print("  ");
           }
           for(int k=length; k>=i; k--){
               System.out.print("* ");
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
        for( int i=1; i <=length; i++){
            for(int j=length; j>i; j-- ){
                System.out.print("  ");
            }
            for( int k =1; k<i+i; k++){
                System.out.print("* ");
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
        for(int i=1; i<=length; i++){
            for(int j=1; j<i; j++ ){
                System.out.print("  ");
            }
            for(int k=1+(length+length); k>i+i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
