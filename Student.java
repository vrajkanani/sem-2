class person{
    String name;
    int a=20;
    person(){
        name="undefine";
    }
    person(String name){
        this.name=name;
    }
    public void displayA(){
        System.out .println(a);
    }
}
class student1 extends person{
    int marks;
    int a=40;
    student1(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public void displayA(){
        System.out .println(a);
    }
    public String toString(){
        return name+" "+marks;
    }
} 
public class Student{
    public static void main(String[] args) {
        student1 s1=new student1("vraj",100);
        System.out .println(s1);
    }
}