package main.java.java.a.beginners.guide.chapter04;

public class AddMeth {
    public static void main(String[] args) {
        //Vehicle minivan = new Vehicle();
        //Vehicle sportscar = new Vehicle();
        Vehicle minivan = new Vehicle(0, 0, 0);
        Vehicle sportscar = new Vehicle(0, 0, 0);

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

/*
        // Расчет дальности поездки с полным баком горючего
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
*/

        System.out.print("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров. ");
        minivan.range();
        System.out.print("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров. ");
        sportscar.range();
    }
}
