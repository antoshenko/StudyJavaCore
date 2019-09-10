package main.java.java.a.beginners.guide.chapter07.p297;

class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructor
    }

    Rectangle(double x) {
        super(x, "rectangle"); // call superclass constructor
    }

    Rectangle(Rectangle ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
