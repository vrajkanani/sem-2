import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number:");
        int start=sc.nextInt();
        System.out.println("Enter ending number:");
        int end=sc.nextInt();
        System.out.println( "Number which divisible by 2 but not divisible by 3 :");
        for(int i=start; i<=end; i++){
            if(i%2==0 && i%3!=0){
                System.out.print(" "+i);
            }
        }
    }
}