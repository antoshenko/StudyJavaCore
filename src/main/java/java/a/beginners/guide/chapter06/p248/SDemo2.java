package main.java.java.a.beginners.guide.chapter06.p248;

class SDemo2 {
    public static void main(String[] args) {
        System.out.println("val value: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("val value: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
