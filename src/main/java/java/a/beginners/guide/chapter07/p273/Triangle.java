package main.java.java.a.beginners.guide.chapter07.p273;

class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
