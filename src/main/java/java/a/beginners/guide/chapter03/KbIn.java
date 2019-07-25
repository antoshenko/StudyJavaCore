package main.java.java.a.beginners.guide.chapter03;

public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");
        ch = (char) System.in.read();

        System.out.println("Вы надали клавишу " + ch);
    }
}
