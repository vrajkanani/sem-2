import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
        int ans;
        MaxNumber m1=new MaxNumber();
        ans=m1.max(a,b);
        System.out.println("Max number is "+ans);
    }
    public int max(int a,int b){
        if (a>b) {
            return a;
        }
        else{
            return b;
        }
    }
}
