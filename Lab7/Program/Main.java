import CIE.*;
import SEE.*;
import java.util.Scanner;
public class Main{
public static void main(String args[]){
System.out.println("enter the number of students");
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
Externals ex[]=new Externals[n];
Internals in[]=new Internals[n];
for(int i=0;i<n;i++){
System.out.println("enter the name ,usn and sem along with their marks in cie and see");
String name=scan.next();
String usn=scan.next();
int sem=scan.nextInt();
in[i]=new Internals();
in[i].name=name;
in[i].usn=usn;
in[i].sem=sem;
ex[i]=new Externals();
ex[i].name=name;
ex[i].usn=usn;
ex[i].sem=sem;
for(int j=0;j<5;j++){
in[i].scores[j]=scan.nextInt();
ex[i].scores[j]=scan.nextInt();
}
}
System.out.println("the total marks for each student are");
for(int i=0;i<n;i++){
System.out.println("total marks for "+(i+1)+"th student are");
System.out.print("name : "+in[i].name+" usn :"+in[i].usn+" sem: "+in[i].sem);
for(int j=0;j<5;j++){
System.out.println(in[i].scores[j]+ex[i].scores[j]+" ");
}
System.out.println();
}
}
}