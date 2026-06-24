class MathOperations {

    // Multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Multiply three integers
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Multiply two floating-point numbers
    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println("Product of two integers: " +
                obj.multiply(5, 4));

        System.out.println("Product of three integers: " +
                obj.multiply(2, 3, 4));

        System.out.println("Product of two floating-point numbers: " +
                obj.multiply(2.5, 4.0));
    }
}
