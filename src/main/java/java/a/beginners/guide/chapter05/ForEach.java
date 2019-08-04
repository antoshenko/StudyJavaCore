package main.java.java.a.beginners.guide.chapter05;

class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum;

        sum = 0;
        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
        }
        System.out.println("Сумма: " + sum);

        System.out.println();

        sum = 0;
        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if (x==5) break;
        }
        System.out.println("Сумма 5 элементов: " + sum);
    }
}
