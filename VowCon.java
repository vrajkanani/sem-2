import java.util.*;
public class VowCon{
	public static void main(String[] args) {
		Scanner vk=new Scanner(System.in);
		System.out.println("Enter a no. =");
		char vr =vk.nextChar();
		if(vr =='a' || vr =='e' || vr =='i' || vr =='o' || vr=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonants");
		}
		
	}
}