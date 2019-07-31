package main.java.java.a.beginners.guide.chapter03;

public class ReadSymbols {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        int sum = 0;

        for (; ; ) {
            do {
                System.out.println("Нажмите любую клавишу, а затем клавишу ENTER: ");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
                if (choice == ' ') sum++;
            } while (choice != '.');

            if (choice == '.') break;
        }
        System.out.println("spaces sum = " + sum);
    }
}