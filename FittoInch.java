import java.util.*;
public class FittoInch{
	public static void main(String[] args) {
		Scanner vr = new Scanner(System.in);
		System.out.println("Enter a meater =");
		int a=vr.nextInt();
		float feet = a*3.28f;
		System.out.println("Inch is ="+feet);
	}
}