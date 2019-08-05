package main.java.java.a.beginners.guide.chapter05;

public class ArithmeticalMean {
    public static void main(String[] args) {
        double arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = 0;

        for (int i = 0; i < 10; i++) average += arr[i];

        average = average / 10;
        System.out.println("Среднее арифметическое: " + average);
    }
}
