public class Simple{
    public static void main(String[] args) {
        int p=10,r=10,n=10;
       
      int a;
      a=intress(p,r,n);
      System.out.println("sim="+a);
    }
    public static int intress(int p,int r,int n) {
       int ans=0;
       ans=(p*r*n)/100;
        return ans;
    }
}