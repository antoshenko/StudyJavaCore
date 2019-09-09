package main.java.java.a.beginners.guide.chapter07.p283;

class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h); // call superclass constructor

        style = s;
    }

    Triangle(double x) {
        super(x); // call superclass constructor

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}