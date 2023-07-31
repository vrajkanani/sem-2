import java.util.Scanner;
public class Sumscanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=a+b;
        System.out.println("Sum ="+c);
    }
}