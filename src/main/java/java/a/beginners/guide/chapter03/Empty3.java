package main.java.java.a.beginners.guide.chapter03;

// Тело цикла может быть пустым
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum += i++) ;

        System.out.println("Сумма: " + sum);
    }
}
