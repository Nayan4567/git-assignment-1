import java.util.Scanner;
class ReverseString {
    static String reverse(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        System.out.println("Reversed: " + reverse(input));
        sc.close();
    }
}
