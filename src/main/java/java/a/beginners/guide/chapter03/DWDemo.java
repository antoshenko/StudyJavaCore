package main.java.java.a.beginners.guide.chapter03;

// Example didn't work from book
public class DWDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch =0;

        do {
            if (ch != '\n') {
                System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            }
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
