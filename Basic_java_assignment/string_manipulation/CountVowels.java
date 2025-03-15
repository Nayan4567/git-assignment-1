import java.util.Scanner;
class CountVowels {
    static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count vowels: ");
        String input = sc.nextLine();
        System.out.println("Number of vowels: " + countVowels(input));
        sc.close();
    }
}