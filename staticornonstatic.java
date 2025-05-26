class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Static Add: " + MathUtils.add(5, 10));
        
        MathUtils mathUtils = new MathUtils();
        System.out.println("Non-Static Multiply: " + mathUtils.multiply(5, 10));
    }
}
