package main.java.java.a.beginners.guide.chapter04;

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    // Отображение дальности поездки транспортного средства
    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }
}