package main.java.java.a.beginners.guide.chapter04;

public class RetMeth {
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

        // Получение дальности поездки для разных транспортных средств
        range1 = minivan.range2();
        range2 = sportscar.range2();

/*
        System.out.println("Мини-фургон может перевезти " +
                            minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " +
                            sportscar.passengers + " пассажиров на расстояние " + range2 + " миль.");
*/
        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + minivan.range2() + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + sportscar.range2() + " миль.");
    }
}
