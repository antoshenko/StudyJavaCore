package main.java.java.a.beginners.guide.chapter06.p233;

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Alternate call of all versions of the "ovlDemo" method
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Call result ob.ovlDemo(4, 6): " + resI);

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Call result ob.ovlDemo(1.1, 2.32): " + resD);
    }

}
