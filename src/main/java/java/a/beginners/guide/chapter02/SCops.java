package main.java.java.a.beginners.guide.chapter02;

// Демонстрация использования укороченных логических операторов
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);

        d = 0;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);

        if (d != 0 & (n % d) == 0)
            System.out.println(d + " является делителем " + n);
    }
}
