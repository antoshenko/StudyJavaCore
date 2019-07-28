package main.java.java.a.beginners.guide.chapter03;

// Example didn't work from book
// Changed
public class ForTest {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Для остановки нажмите клавишу S");
        int i;
        char ch = 0;

        for (i = 0; ch != 'S'; i++) {
            ch = (char) System.in.read();
            if (ch != '\n'){
                System.out.println("Проход #" + i);
                i--;
            }
        }
    }
}