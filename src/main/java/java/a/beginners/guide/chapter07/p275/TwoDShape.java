package main.java.java.a.beginners.guide.chapter07.p275;

import main.java.java.a.beginners.guide.chapter05.TwoD;

class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and Height - " + width + " and " + height);
    }
}
