package main.java.java.a.beginners.guide.chapter06.p226;

class Queue1 {
    private char q[];
    private int putloc, getloc;

    Queue1(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    // Извлечение сивола из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

}
