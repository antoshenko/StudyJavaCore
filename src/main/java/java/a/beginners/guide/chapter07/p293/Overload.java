package main.java.java.a.beginners.guide.chapter07.p293;

class Overload {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);

        subOb.show("k: "); // this calls show() in B
        subOb.show(); // this calls show() in A
    }
}
