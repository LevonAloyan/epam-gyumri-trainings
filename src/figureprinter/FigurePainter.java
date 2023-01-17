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
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
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
        // TODO : complete the method
        for(int i = 1; i <= length; i++){
            for (int j = 5; j > i; j--){
                System.out.print("  ");
            }
            for (int k=1; k <= i; k++){
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
        // TODO : complete the method
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
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
    public static void drawRightBottomTriangle(int length) {
        // TODO : complete the method
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= length; k++) {
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
        public static void drawRhombus ( int length){
            // TODO : complete the method
            for (int i = 0; i < length; i++) {
                // 4 - 1
                for (int j = 0; j < (length - i) - 1; j++) {
                    System.out.print(" ");
                }
                // i == 0;
                for (int j = 0; j <= i * 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = length - 1; i > 0; i--) {
                for (int j = 0; j < length - i; j++) {
                    System.out.print(" ");
                }
                for (int j = ((length - 1) * 2); j > (((length - i) * 2) - 1); j--) {
                    System.out.print("*");
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



        //something doesn't work here, doesn't equal "draw Isosceles Triangle", "drawBottomIsoscelesTriangle"
        public static void drawIsoscelesTriangle ( int length){
            for (int i = 1; i <= length ; i++) {
                for (int j = i; j <=length ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");
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
        public static void drawBottomIsoscelesTriangle ( int length){
            for (int i = 0; i <= length ; i++) {
                for (int j = 0; j <=i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < length ; j++) {
                    System.out.print("* ");
                }
                for (int k = i; k <= length ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
