import java.util.Scanner;
public class MetertoFeet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter meter :");
        int meter=sc.nextInt();
        float feet =meter*(float)3.28;
        System.out.print("Feet ="+feet);
    }
}