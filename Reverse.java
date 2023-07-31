import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit;
        System.out.println("Enter number:");
        int n=sc.nextInt();

        while(n!=0)
        {
            digit=n%10;
            System.out.print(digit);
            n=n/10;
        }
    }
}