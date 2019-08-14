package main.java.java.a.beginners.guide.chapter06.p241;

class QDemo2 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);
        char name[] = {'T', 'o', 'm'};
        // Creating an array based queue
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Put a series of characters into a queue q1
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Creating one queue based on another
        Queue q3 = new Queue(q1);

        // Queues mapping
        System.out.print("Content q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Content q2: ");

        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Content q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
