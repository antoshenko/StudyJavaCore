package main.java.java.a.beginners.guide.chapter07.p275;

class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h) {
        super(w,h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
