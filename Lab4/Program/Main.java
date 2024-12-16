class Main{
public static void main(String[] args){
Lion l1=new Lion();
Deer d1=new Deer();
Tiger t1=new Tiger();
System.out.println("the lion is ");
l1.eat();
l1.sleep();
System.out.println("the deer is ");
d1.eat();
l1.sleep();
System.out.println("the tiger is ");
t1.eat();
t1.sleep();
}
}
abstract class Animal{
abstract void eat();
abstract void sleep();
}
class Lion extends Animal{
void eat(){
System.out.println("the lion eats meat");
}
void sleep(){
System.out.println("the Lion sleeps");
}
}
class Deer extends Animal{
void eat(){
System.out.println("the deer eats grass");
}
void sleep(){
System.out.println("the deer sleeps quietly");
}
}
class Tiger extends Animal{
void eat(){
System.out.println("the tiger eats meat");
}
void sleep(){
System.out.println("the tiger sleeps in cave");
}
}