public class Inheritance {
    public static void main(String [] args){
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.area();
        t1.area(3,4);
        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area(3);
    }
}

class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((l*h)/2);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int s){
        System.out.println((s*s)/2);
    }
}