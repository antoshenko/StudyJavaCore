package main.java.java.a.beginners.guide.chapter03;

public class FindFac2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j*2 <= i; j++) {
                num1++;
                if ((i % j) == 0) {
                        System.out.print(j + " ");
                        num2++;
                    }
                }
                System.out.println();
            }
            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);
        }
    }
