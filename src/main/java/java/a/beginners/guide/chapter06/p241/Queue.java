package main.java.java.a.beginners.guide.chapter06.p241;

class Queue {
    private char q[];           // array for storing queue elements
    private int putloc, getloc; // indexes for inserting and retrieving queue elements

    // Create an empty queue of a given size
    Queue(int size) {
        q = new char[size + 1]; // allocation of memory for the queue
        putloc = getloc = 0;
    }

    // Creating a queue based on an existing object Queue
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Copy items to the queue
        for (int i = getloc; i <= putloc; i++) // error: "for (int i = getloc + 1; i <= putloc; i++)"
            q[i] = ob.q[i];
    }

    // Creating a queue based on an array of initial values
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    // Put character into a queue
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - The queue is full");
            return;
        }

        q[putloc++] = ch;
    }

    // Extract character from queue
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }

        return q[getloc++];
    }
}
