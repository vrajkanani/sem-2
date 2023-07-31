import java.util.Scanner;

public class DiameterofCircle {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter area of circle:");
        double area=sc.nextDouble();

        double rsquare = area/3.14;
        double r=Math.sqrt(rsquare);
        double d=r+r;
        System.out.println("Diameter is :"+d);
    }
}
