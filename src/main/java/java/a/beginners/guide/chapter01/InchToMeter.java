package main.java.java.a.beginners.guide.chapter01;

public class InchToMeter {
    public static void main(String[] args) {
        double inch, inches, foots, meter;
        int counter;

        foots = 12;
        inches = foots * 12;

        counter = 0;
        for (inch = 1; inch <= inches; inch++) {
            meter = inch * 39.37;
            System.out.println(inch + " дюйм соответствует " + meter + " метра.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}