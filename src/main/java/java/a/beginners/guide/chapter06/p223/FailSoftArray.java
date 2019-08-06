package main.java.java.a.beginners.guide.chapter06.p223;

public class FailSoftArray {
    private int a[];
    private int errval; // значение, возвращаемое в случае возникновения ошибки при выполнении метода get()
    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возврат значения элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    // Установка значения элемента с заданным индексом.
    // Если возникнет ошибка, вернуть логическое значение false.
    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Возврат логического значения true, если индекс не выходит за пределы массива
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}
