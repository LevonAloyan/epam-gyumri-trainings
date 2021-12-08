public  class classMain {
    static class A {
        public void m(Number n) {
            n = 5 / 3;
            System.out.println("class A, method m : " + n);
        }
    }

    static class B extends A {
        public void m(Double d) {
            d = d / 3;
            System.out.println("class B, method m : " + d);
        }
    }


}
class MainClass {
    public static void main(String[] args) {
        classMain.A a = new classMain.B();
        a.m(5.0);
    }
}