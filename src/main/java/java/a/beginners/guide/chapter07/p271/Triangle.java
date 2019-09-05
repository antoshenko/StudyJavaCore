package main.java.java.a.beginners.guide.chapter07.p271;

class Triangle extends TwoDShape {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
