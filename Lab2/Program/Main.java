import java.util.Scanner;
 class Main{
public static void main(String[] args){
SGPA s1=new SGPA();
SGPA s2=new SGPA();
System.out.println("enter the details of student 1");
s1.takeInput();
System.out.println("enter the details of student 2");
s2.takeInput();
System.out.println("the details of the first student along with sgpa is");
s1.displayInput();
System.out.println("the sgpa is "+s1.calcSGPA());
System.out.println("the details of the second student along with sgpa is");
s2.displayInput();
System.out.println("the sgpa is "+s2.calcSGPA());
}
}
class SGPA{
String name,usn;
int[] marks,credits;
void takeInput(){
Scanner scan =new Scanner(System.in);
System.out.println("enter the name and usn of the students");
name=scan.nextLine();
usn=scan.nextLine();
marks=new int[8];
credits=new int[8];
System.out.println("now enter the marks and credits of 8 subjects");
for(int i=0;i<8;i++){
marks[i]=scan.nextInt();
credits[i]=scan.nextInt();
}
}
void displayInput(){
System.out.println("the data of the students marks and credits are");
System.out.println("name :"+name+" usn: "+usn);
for(int i=0;i<8;i++){
System.out.println("credits :"+credits[i]+" marks: "+marks[i]);
}
}
int getGrade(int num){
if(num>=90){
return 10;
}
else if(num>=80){
return 9;
}
else if(num>=70){
return 8;
}
else if(num>=60){
return 7;
}
else if(num>=50){
return 6;
}
else if(num>=40){
return 5;
}
return 0;
}
float calcSGPA(){
float sgpa=0f;
float total=0f;
for(int i=0;i<8;i++){
sgpa+=getGrade(marks[i])*credits[i];
total+=credits[i];
}
sgpa/=total;
return sgpa;
}
}