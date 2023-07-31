import java.util.Scanner;
public class HeightandWeight{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pound:");
        int weight=sc.nextInt();
        System.out.print("Enter height in inches:");
        int height=sc.nextInt();

        float w=weight*(float)0.45359237;
        float h=height*(float)0.0254;
        float BMI=w/(h*h);

        System.out.println(" ");
        System.out.println("Weight in Kg:"+w);
        System.out.println("Height in meter:"+h);
        System.out.println("BMI IS :"+BMI);
    }
}