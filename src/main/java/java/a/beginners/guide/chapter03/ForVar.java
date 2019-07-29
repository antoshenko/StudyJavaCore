package main.java.java.a.beginners.guide.chapter03;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Вычисление факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }

        // Однако здесь переменная i доступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
