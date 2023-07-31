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

public class SingleInhe{
    public static void main(String[] args) {
        second obj=new second();
    }
}