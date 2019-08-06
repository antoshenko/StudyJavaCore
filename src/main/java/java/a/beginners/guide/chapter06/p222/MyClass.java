package main.java.java.a.beginners.guide.chapter06.p222;

class MyClass {
    private int alpha; // закрытый доступ
    public int beta;   // открытый доступ
    int gamma; // тип доступа по умолчанию (по сути, public)

    // Методы доступа к переменной alpha. Члены класса могут обращаться к закрытым членам того же класса.
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
