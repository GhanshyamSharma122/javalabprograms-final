import java.util.*;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the son's and father's details");
Son s=new Son(scan.next(),scan.nextInt(),scan.next(),scan.nextInt());

}
}
class WrongAge extends Exception{
int age;
WrongAge(int age){
this.age=age;
}
public String toString(){
return "invalid age "+age;
}
}
class Father{
String name;
int age;
Father(String name,int age){
this.name=name;
try{
if(age>0){
this.age=age;
System.out.println("fathr age is valid");
}else{
throw new WrongAge(age);
}

}catch(WrongAge e){
System.out.println(e);
System.out.println("negative fathers age");
}
}

}
class Son extends Father{
Son(String name,int age,String FatherName,int fatherage){
super(FatherName,fatherage);
try{
if(age>=0 && age<fatherage){
this.age=age;
System.out.println("son age is valid");
}else{
throw new WrongAge(age);
}
}catch(WrongAge e){
System.out.println(e);
System.out.println(age<0?"negative error":"son age cannot be more than fathers");
}
}
}