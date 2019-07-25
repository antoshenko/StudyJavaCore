package main.java.java.a.beginners.guide.chapter02;

// Отображение таблицы истинности для логических операций
public class LogicalOpTable2 {
    public static void main(String[] args) {
        int p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + ((p + 1) % 2));

        p = 1;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + ((p + 1) % 2));

        p = 0;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + ((p + 1) % 2));

        p = 0;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + ((p + 1) % 2));
    }
}
