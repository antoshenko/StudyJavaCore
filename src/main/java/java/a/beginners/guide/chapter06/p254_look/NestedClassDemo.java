package main.java.java.a.beginners.guide.chapter06.p254_look;

class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};

        Outer outOb = new Outer(x);

        outOb.Analyze();
    }
}
