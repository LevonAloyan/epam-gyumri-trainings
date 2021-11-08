package figureprinter;

public class FigurePainter {
    public static void deawLeftUpTriangle(int length) {
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
        System.out.println();
    }


    public static void drawRigthUpTrangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
                System.out.print(" "+ "*");
            System.out.println();
        }
        System.out.println();
    }
    public static void drawRighttBattomTriangle(int length){
        for(int i=0; i<length;i++){
            for(int j=0;j<length-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawLeftBattomTriangle(int length){ //not ready
        for(int i=length;i>=1;i--){
            for(int j=length;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawRhombus(int length){
        for(int i=1;i<length;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<length; i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<length-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void drawIsoscelesTriangle(int length){
        for(int i=1;i<=length;i++){
            for(int j=i;j<=length;j++){
                System.out.print("  ");

            }
            for(int k=1;k<i;k++){
                System.out.print(" *");
            }
            for(int h=1;h<=i;h++){
                System.out.print(" *");
            }

            System.out.println();
        }
        System.out.println();
    }
    public static void drawBattomIsoscelesTriangle(int length){
        for(int i=0;i<length;i++){
            for(int j=i;j>0;j--){
                System.out.print("  ");
            }
            for(int k=i;k<length;k++){
                System.out.print(" *");
            }
            for(int h=i;h<length-1;h++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
