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
        String text = "* ";
        for(int i = 1; i <= length; i++){
            System.out.println(text);
            text += "* ";
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
        for ( int i = length; i > 0; i-- ){
            String text = "";
            for (int k = i; k > 1; k-- ){
                text += "  ";
            }
            for (int j = 1; j <= length - i + 1; j++){
                text += "* ";
            }
            System.out.println(text);
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
        for ( int i = length; i > 0; i-- ){
            String text = "";
            for (int k = i; k > 0; k-- ){
                text += "* ";
            }
            System.out.println(text);
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
        for ( int i = length; i > 0; i-- ){
            String text = "";
            for (int j = 0; j <= length - i - 1; j++){
                text += "  ";
            }
            for (int k = i; k > 0; k-- ){
                text += "* ";
            }
            System.out.println(text);
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
        length--;
        for ( int i = length; i > 0; i-- ){
            String text = "";
            for (int k = i; k > 1; k-- ){
                text += " ";
            }
            for (int j = 1; j <= length - i + 1; j++){
                text += "* ";
            }
            System.out.println(text);
        }
        for ( int i = length-1; i > 0; i-- ){
            String text = "";
            for (int j = 0; j <= length - i - 1; j++){
                text += " ";
            }
            for (int k = i; k > 0; k-- ){
                text += "* ";
            }
            System.out.println(text);
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
        for ( int i = length; i > 0; i-- ){
            String text = "";
            for (int k = i; k > 1; k-- ){
                text += "  ";
            }
            for (int j = 1; j <= length - i + 1; j++){
                text += "* ";
                if(j > 1){
                    text += "* ";
                }
            }
            System.out.println(text);
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
        for ( int i = length; i > 0; i-- ){
            String text = "";
            for (int j = 0; j <= length - i - 1; j++){
                text += "  ";
            }
            for (int k = i; k > 0; k-- ){
                text += "* ";
                if(k > 1){
                    text += "* ";
                }
            }
            System.out.println(text);
        }
    }

}
