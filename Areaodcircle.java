import java.util.Scanner;
public class Areaofcricle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number=");
        int a=sc.nextInt();
        int c;
       c=(1/2)*3.14f*a*a;
        System.out.println("Area of circle is ="+c);
    }
}