package main.java.java.a.beginners.guide.chapter04;

public class CompFuel {
    public static void main(String[] args) {
        //Vehicle minivan = new Vehicle();
        //Vehicle sportscar = new Vehicle();
        Vehicle minivan = new Vehicle(0, 0, 0);
        Vehicle sportscar = new Vehicle(0, 0, 0);
        double gallons;
        int dist = 252;

        // Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");
    }
}
