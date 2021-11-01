package figureprinter;

public class FigurePainter {

    public static void drawLeftUpTriangle(int length) {
        for(int i = 0; i < length; ++i) {
            for(int j = 0; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void drawRightUpTriangle(int length) {
        for(int i = length; i > 0; --i) {
            for(int j = 0; j < length + 1; ++j) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void drawLeftBottomTriangle(int length) {
        for(int i = length; i > 0; --i) {
            for(int j = 0; j < length; ++j) {
                if (j < i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void drawRightBottomTriangle(int length) {
        for(int i = 0; i < length; ++i) {
            for(int j = 0; j < length; ++j) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void drawRhombus(int length) {
        int i;
        int j;
        for(i = length; i > 0; --i) {
            for(j = 0; j <= length * 2 - i; ++j) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for(i = 0; i <= length; ++i) {
            for(j = 0; j <= length * 2 - i; ++j) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void drawIsoscelesTriangle(int length) {
        for(int i = length; i > 0; --i) {
            for(int j = 0; j <= length * 2 - i; ++j) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

    public static void drawBottomIsoscelesTriangle(int length) {
        for(int i = 0; i < length; ++i) {
            for(int j = 0; j < length * 2 - i; ++j) {
                if (j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
