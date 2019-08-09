package main.java.java.a.beginners.guide.chapter06.p233;

class Overload {
    void ovlDemo() {
        System.out.println("Without parameters");
    }

    void ovlDemo(int a) {
        System.out.println("One parameters: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Two parameters of type double: " + a + " " + b);
        return a + b;
    }


}
