package figureprinter;

import java.sql.SQLSyntaxErrorException;

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
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("drawLeftUpTriangle");
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
        for (int i = 1; i <= length ; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("drawRightUpTriangle");
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
        for (int i = 1; i <=length ; i++) {
            for (int j = length; j > i; j--) {
                System.out.print("*");
            }
                System.out.println("*");
            }
        System.out.println("drawLeftBottomTriangle");
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
        for (int i = 1; i <= length ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = length; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println("drawRightBottomTriangle");
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
        for (int i = 1; i <= length; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <=length ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("drawRhombus");
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
        for (int i = 0; i < length ; i++) {
            for (int j = length; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("drawIsoscelesTriangle");
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
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = length; j > i; j--) {
                System.out.print("*");
            }
            for (int j = length - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("drawBottomIsocselesTriangle");
    }
}
