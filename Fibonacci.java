import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
        System.out.println(n+"th fibonacci number is = "+fibo(n));
    }
    public static int fibo(int n) {
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}