package main.java.java.a.beginners.guide.chapter04;

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    // Отображение дальности поездки транспортного средства
    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }

    // Определение дальности поездки транспортного средства
    int range2() {
        return mpg * fuelcap;
    }

    void myMeth() {
        int i;

        for (i = 0; i < 10; i++) {
            if (i == 5) return; // Завершение цикла после достижения значения 5
            System.out.println();
        }
    }

    // Расчет количества топлива, необходимого транспортному средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
