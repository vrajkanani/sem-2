class first{
    first(){
     System.out.println("from first");
    }
}
class second extends first{
     second(){
        System.out.println("from second");
     }
}
class third extends second{
    third(){
       System.out.println("from third");
    }
}

public class MultiInhe{
    public static void main(String[] args) {
        third obj=new third();
    }
}