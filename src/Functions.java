public class Functions {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Result of addition: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}


// why functions are needed?

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        // Handles potential floating-point precision issues
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3);
        int difference = subtract(10, 2);
        double product = multiply(3.14, 2.0);
        double quotient = divide(12.0, 3.0);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
