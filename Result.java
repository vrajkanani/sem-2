import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five subjects marks:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int per=(a+b+c+d+e)/5;
        System.out.println("Percentage is:"+per);
        if (per>70) {
            System.out.println("Distinction class");
        }
        else if (per>60) {
            System.out.println("First class");
        } 
        else if (per>45) {
            System.out.println("Second class");
        } 
        else if (per>35) {
            System.out.println("pass class");
        } 
        else{
            System.out.println("Fail");
        }
    }
}
