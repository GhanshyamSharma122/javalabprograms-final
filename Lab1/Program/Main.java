import java.util.Scanner;
 class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
float a,b,c,d,r1,r2;
System.out.println("enter the value for the a,b,c for the quadratic equation");
a=scan.nextFloat();
b=scan.nextFloat();
c=scan.nextFloat();
d=b*b-4*a*c;
if(a==0){
System.out.println("roots cannot be determined");
}
else{
if(d>=0){
r1=(-b+(float)Math.sqrt(d))/(2*a);
r2=(-b-(float)Math.sqrt(d))/(2*a);
System.out.println("the two roots are "+r1+" and "+r2);
}else{
System.out.println("there are no real solutions");
}
}
}
}