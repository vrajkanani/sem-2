import java.util.*;
public class Pound{
	public static void main(String[] args) {
		Scanner vr = new Scanner(System.in);
		System.out.println("Enter your weight in pond =");
		int weight =vr.nextInt();
		System.out.println("Enter your height in inch =");
		int height =vr.nextInt();

		float w=weight*0.45359237f;
		float h=height*0.0254f;
		System.out.println("weight ="+w);
		System.out.println("height ="+h);

		float bmi=(float)w/(h*h);
		System.out.println("bmi ="+bmi);
	}
}