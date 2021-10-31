package FigurePainter;

public class FigurePainter {
    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
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
    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i + j >= length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = length-1; j >= i; j--) {
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
        for (int i = 0; i < length-1; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length-1; j >= i; j--) {
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
    public static void drawIsoscelesTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i * 2; j++) {
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
        public static void drawBottomIsoscelesTriangle(int length){
            for (int i = 0; i < length-i; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j =length- 1; j >=i*2; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }

