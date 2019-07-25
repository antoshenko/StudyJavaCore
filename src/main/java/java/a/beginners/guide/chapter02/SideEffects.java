package main.java.java.a.beginners.guide.chapter02;

public class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        if (false & (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i); // отображается 1

        if (false && (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i); // по-прежнему отображается 1!!
    }
}
