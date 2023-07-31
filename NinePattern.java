import java.util.Scanner;
public class NinePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int k=num; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){

                if(j==1 || j==(2*i-1) || i==num){
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

      

    }
}
