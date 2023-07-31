import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sides of triangle:\n");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        
        if(side1 == side2 && side2 == side3)
        {
           System.out.print("The Given Triangle is equilateral");
        }
        
        else if(side1 == side2 || side2 == side3 || side3 == side1)
        {
           System.out.print("The given Triangle is isosceles");
        }
        
        else
        {
           System.out.print("The given Triangle is scalene");
        }
    }
}