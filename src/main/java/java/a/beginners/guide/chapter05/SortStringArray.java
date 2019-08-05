package main.java.java.a.beginners.guide.chapter05;

public class SortStringArray {
    public static void main(String[] args) {
        String nums[] = {"b", "d", "a", "c", "e", "g", "h", "f", "z", "y"};
        int a, b;
        String t;
        int size;

        size = 10;

        // Отображение исходного массива
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1].compareTo(nums[b]) > 0) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }


        // Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
