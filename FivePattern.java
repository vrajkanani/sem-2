import java.util.Scanner;
public class FivePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int k=num; k>=i; k--){
                    System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
