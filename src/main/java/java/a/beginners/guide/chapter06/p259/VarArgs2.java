package main.java.java.a.beginners.guide.chapter06.p259;

class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One arg in array: ",10);
        vaTest("Three arg in array: ",1, 2, 3);
        vaTest("No arg in array: ");
    }
}

