import java.util.Scanner;
public class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of calls:");
        int n=sc.nextInt();
        double totalrs=200;

        if(n>100 && n<=150){
            totalrs= totalrs +((n-100)*0.60);
        }
        else if(n>150 && n<=200){
            totalrs= totalrs +(50*0.60)+((n-150)*0.50);
        }
        else if(n>200){
            totalrs=totalrs+(50*0.60)+(50*0.50)+((n-200)*0.40);
        }
        System.out.println("total bill is rs:"+totalrs);
    }
}
