class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Int Add: " + calc.add(5, 10));
        System.out.println("Double Add: " + calc.add(5.5, 10.5));
    }
}
