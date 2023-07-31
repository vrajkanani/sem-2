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
class four extends third{
    four(){
        System.out.println("from four");
    }
}

public class HirInhe{
    public static void main(String[] args) {
        four obj=new four();

    }
}