import java.util.*;
public class Perfectno{
	public static void main(String[] args) {
		Scanner vraj=new Scanner(System.in);
 		int x=vraj.nextInt();
 		int i,sum=0;
 		for(i=1;i<x;i++)
 		{
 			if(x%i==0)
 			{
 				sum=sum+i;
 			}
 		}
 		if(sum==x)
 		{
 			System.out.println("no is Perfect");
 		}
 		else
 		{
 			System.out.println("no is not Perfect");
 		}
	}
}