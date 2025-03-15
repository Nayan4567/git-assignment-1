class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("Logical Operators:");
        System.out.println((a > 5 && b < 10));
        System.out.println((a < 5 || b > 10));

        System.out.println("Relational Operators:");
        System.out.println(a > b);
        System.out.println(a == b);
    }
}

