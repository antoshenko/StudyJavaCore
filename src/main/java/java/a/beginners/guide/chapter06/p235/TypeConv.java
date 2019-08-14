package main.java.java.a.beginners.guide.chapter06.p235;

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // ob.f(int) method call
        ob.f(d); // ob.f(double) method call

        ob.f(b); // ob.f(int) method call with type conversion
        ob.f(s); // ob.f(int) method call with type conversion
        ob.f(f); // ob.f(double) method call with type conversion
    }
}
