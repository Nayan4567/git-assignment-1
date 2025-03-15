import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int Number = sc.nextInt();
    if(Number%2==0){
        System.out.println(Number+" is a Even Number");
    }
    else{
        System.out.println(Number+" is a Odd Number");
    }
   sc.close();
        
    }
}