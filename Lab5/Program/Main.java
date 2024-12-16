import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
System.out.println("enter the rectangle length and breadth");
Rectangle r1=new Rectangle(scan.nextDouble(),scan.nextDouble());
r1.area();
System.out.println("enter the triangle breadth and height");
Triangle t1=new Triangle(scan.nextDouble(),scan.nextDouble());
t1.area();
System.out.println("enter the circle radius");
Circle c1=new Circle(scan.nextDouble());
c1.area();
}
}
abstract class Shapes{
double a,b;
Shapes(double a,double b){
this.a=a;
this.b=b;
}
Shapes(double a){
this.a=a;
}
abstract void area();
}
class Rectangle extends Shapes{
Rectangle(double a,double b){
super(a,b);
}
void area(){
System.out.println("the area is "+(this.a*this.b));
}
}
class Triangle extends Shapes{
Triangle(double a,double b){
super(a,b);
}
void area(){
System.out.println("the area is "+(this.a*this.b*0.5));
}
}
class Circle extends Shapes{
Circle(double a)
{
super(a);
}
void area(){
System.out.println("the area is "+(Math.PI*this.a*this.a));
}
}