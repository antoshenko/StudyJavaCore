package main.java.java.a.beginners.guide.chapter07.p271;

class TwoDShape {
    private double width;
    private double height;

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
