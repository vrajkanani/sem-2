import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one -> +,-,*,/");
        char ch = sc.next().charAt(0);
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();

        switch (ch) {
            case '+':
                int c = a + b;
                System.out.print("ans is :" + c);
                break;
            case '-':
                int d = a - b;
                System.out.print("ans is :" + d);
                break;
            case '*':
                int e = a * b;
                System.out.print("ans is :" + e);
                break;
            case '/':
                float f = (float)a / (float)b;
                System.out.print("ans is :" + f);
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}