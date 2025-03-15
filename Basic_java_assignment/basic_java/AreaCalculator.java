import java.util.Scanner;

class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1. Circle 2. Rectangle 3. Triangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter radius:");
                double r = sc.nextDouble();
                System.out.println("Area: " + (Math.PI * r * r));
                break;
            case 2:
                System.out.println("Enter length and breadth:");
                double l = sc.nextDouble(), b = sc.nextDouble();
                System.out.println("Area: " + (l * b));
                break;
            case 3:
                System.out.println("Enter base and height:");
                double base = sc.nextDouble(), height = sc.nextDouble();
                System.out.println("Area: " + (0.5 * base * height));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}