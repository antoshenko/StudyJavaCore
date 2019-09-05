package main.java.java.a.beginners.guide.chapter07.p267;

class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}
