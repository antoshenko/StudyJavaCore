package main.java.java.a.beginners.guide.chapter02;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int sum = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) sum = sum + 1;
            }
            if (sum == 1) System.out.println("Простое число: " + i);
            else System.out.println("Сложное число: " + i);
        }
    }
}
