package main.java.java.a.beginners.guide.chapter05;

class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
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
