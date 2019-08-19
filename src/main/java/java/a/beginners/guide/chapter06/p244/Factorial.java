package main.java.java.a.beginners.guide.chapter06.p244;

class Factorial {
    int factR(int n) {
        int result;

        if (n == 1) return 1;
        result = factR(n - 1) * n;
        return result;
    }

    int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}
