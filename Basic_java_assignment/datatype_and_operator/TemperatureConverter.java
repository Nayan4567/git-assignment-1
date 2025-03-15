import java.util.Scanner;
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = sc.nextDouble();
        System.out.println("Convert to (1) Fahrenheit (2) Celsius:");
        int choice = sc.nextInt();
        if (choice == 1) System.out.println("Fahrenheit: " + ((temp * 9/5) + 32));
        else System.out.println("Celsius: " + ((temp - 32) * 5/9));
        sc.close();
    }
}

