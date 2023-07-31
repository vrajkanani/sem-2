public class Area{
    public static void main(String []args){

        Shape sp = new Shape();

        circle c1=new circle(10);
        System.out.println(c1.getArea());
        triangle t1=new triangle(10, 20);
        System.out.println(t1.getArea());
        square s1=new square(10);
        System.out.println(s1.getArea());

    }
}

class Shape{
    int radius;

}
class circle extends Shape{
    circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
}

class triangle extends Shape{
    int b;
    triangle(int radius,int b){
        this.radius=radius;
        this.b=b;
    }
    public double getArea(){
        return 0.5*radius*b;
    }
}

class square extends Shape{
    square(int radius){
        this.radius = radius;

    }
    public double getArea(){
        return radius*radius;
    }
}