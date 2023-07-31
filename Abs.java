abstract class Vegatable{
	String name;
	String color;
}

class Potato extends Vegatable{
	Potato(String name,String color){
		this.name=name;
		this.color=color;
	}
	public String toString(){
	return name+" "+color;
}

}
class Brinjal extends Vegatable{
	Brinjal(String name,String color){
		this.name=name;
		this.color=color;
	}
	public String toString(){
	return name+" "+color;
}
}

class Tometo extends Vegatable{
	Tometo(String name,String color){
		this.name=name;
		this.color=color;
	}
	public String toString(){
	return name+" "+color;
}
}
public class Abs{
	public static void main(String[] args) {
		Potato p1=new Potato("Potato","skin");
		Brinjal p2=new Brinjal("Brinjal","violat");
		Tometo p3=new Tometo("tometo","red");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}