import java.util.Scanner;
public class Cricket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter over :");
        // int n=sc.nextInt();
        int a[][]= new int[1][6];
        int totalrun=0;
        int wicket=0;

       for(int i=0; i<1; i++)
       {
        	for(int j=0; j<6; j++)
            {

                System.out.println("Enter run on this ball(-1 for wide -2 fop no ball): ");
                int run=sc.nextInt();
                int run2=0;
               
                while(run==-1 || run==-2 )
                {
                    if(run==-1){
                        System.out.println("Enter run on this ball(-1 for wide -2 fop no ball): ");
                        run=sc.nextInt();
                        totalrun++;
                    }
                    else if(run==-2){
                        System.out.print("Enter run on this noball:");
                        run2=sc.nextInt();
                        totalrun++;
                        System.out.println("Enter run on this ball(-1 for wide -2 fop no ball): ");
                        run=sc.nextInt();
                        totalrun=totalrun+run2;
                    }
                   
                }
                if(run==-4){
                    wicket=wicket+1;
                }
                if(run>=1){
                    totalrun=totalrun+run;
                }
                 
            }
        }
        System.out.println("Total run="+totalrun);
        System.out.println("Total wicket="+wicket);
    }
       

}

