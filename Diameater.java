import java.util.*;
public class Diameater{
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("Enter area =");
		double area = se.nextDouble();

		double rdus=area/3.14;
		double r=Math.sqrt(rdus);
		double d=r+r;
		System.out.println("d is ="+d);
	}
}