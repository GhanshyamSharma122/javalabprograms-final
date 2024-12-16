class Main{
public static void main(String[] args){
Rectangle p1=new Rectangle(4,5);
Triangle p2=new Triangle(3,4,5);

System.out.println("the perimeter of the rectangle is");
System.out.println(p1.getPerimeter());
System.out.println("the perimeter of the triangle is");
System.out.println(p2.getPerimeter());
System.out.println("the area of the rectangle is");
System.out.println(p1.getArea());
System.out.println("the area of the triangle is");
System.out.println(p2.getArea());
}
}
interface Polygon{
public default double getPerimeter(double a,double b){
return 2*(a+b);
}
public default double getPerimeter(double a,double b,double c){
return a+b+c;
}
public double getArea();
}
class Rectangle implements Polygon{
double a,b;
Rectangle(double a,double b){
this.a=a;
this.b=b;
}
public double getPerimeter(){
return Polygon.super.getPerimeter(a,b);
}
public double getArea(){
return a*b;
}
}
class Triangle implements Polygon{
double a,b,c;
Triangle(double a,double b,double c){
this.a=a;
this.b=b;
this.c=c;
}
public double getPerimeter(){
return Polygon.super.getPerimeter(a,b,c);
}
public double getArea(){
double s=(a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
}