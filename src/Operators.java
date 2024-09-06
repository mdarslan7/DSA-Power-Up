public class Operators {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;

        // Arithmetic operators
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2)); // Integer division (truncates)

        // Double division for accurate results
        System.out.println("Double division: " + ((double) num1 / num2));

        // Assignment operator
        int result = num1 + num2;

        // Comparison operators
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 == num2: " + (num1 == num2));

        // Increment/decrement operators
        num1++; // Increment by 1
        num2--; // Decrement by 1

        // Logical operators (and, or, not)
        boolean isEven = (num1 % 2 == 0) && (num2 % 2 == 0);
        System.out.println("Both numbers are even: " + isEven);
    }
}
