package main.java.java.a.beginners.guide.chapter03;

public class ReadSymbolsASCII {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        int sum = 0;

        do {
            System.out.println("Нажмите любую клавишу, а затем клавишу ENTER: ");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (choice >= 65 & choice <= 90) {
                System.out.println((char) (choice + 32));
                sum++;
            } else if (choice >= 97 & choice <= 122) {
                System.out.println((char) (choice - 32));
                sum++;
            } else System.out.println((char) (choice));

        } while (choice != '.');

        System.out.println("sum = " + sum);
    }
}