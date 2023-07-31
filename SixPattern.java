import java.util.Scanner;
public class SixPattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int k=num; k>=i; k--){
                System.out.print(" "); 
            }
            for(int j=1; j<=(i); j++){  
              System.out.print("* ");  
            }  
            System.out.println(" "); 
        }

        for(int i=num-1; i>=1; i--){
            for(int k=num; k>=i; k--){
                System.out.print(" "); 
            }
            for(int j=1; j<=(i); j++){  
              System.out.print("* ");  
            }  
            System.out.println(" "); 
        }
    }
}
