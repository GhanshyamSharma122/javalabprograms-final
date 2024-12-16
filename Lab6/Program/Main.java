import java.util.Scanner;
class Main{
public static void main(String[] args){
int ch;
Scanner scan=new Scanner(System.in);
System.out.println("enter the type of account");
boolean status;
Account s=null;
String type=scan.nextLine();
while(true){
System.out.println("enter any one of the choices\n1.CreateAccont\n2.withdraw\n3.deposit\n4.calculate interest\n5.generate cheque\n6.deposit cheque\n7.show balance");
ch=scan.nextInt();
switch(ch){
case 1:
if(type.equalsIgnoreCase("Saving")){
System.out.println("enter the name and account number");
String name =scan.next();
int accno =scan.nextInt();
s=new SavingAccount(name,accno);
}else{
System.out.println("enter the name and account number");
String name =scan.next();
int accno =scan.nextInt();
s=new CurrentAccount(name,accno);
}
System.out.println("account create successfully");
break;
case 2:
System.out.println("enter the amount to withdraw");
double d=scan.nextDouble();
if(s.withdraw(d)){
System.out.println("withdraw successfully");
}else{
System.out.println("withdraw unsuccessfully");
}
break;
case 3:
s.deposit();
break;
case 4:
System.out.println("enter year");
s.CalcInterest(scan.nextInt());
break;
case 5:
System.out.println("enter the amount to make cheque");
System.out.println(s.generateCheque(scan.nextDouble()));
break;
case 6:
s.depositCheque();
break;
case 7:
System.out.println(s);
break;
}
if(ch==8)break;
}

}
}
abstract class Account{
String name;
int accno;
double balance;
String type;
Account(String name,int accno){
this.name=name;
this.accno=accno;
}
void deposit(){
Scanner scan =new Scanner(System.in);
System.out.println("enter the amount to deposit");
balance+=scan.nextDouble();
System.out.println("deposit successful.New balance "+balance);
}
void CalcInterest(int year){
System.out.println("service not available");
}
boolean withdraw(double amount){
if(amount>balance){
System.out.println("not enough amount to withdraw");
return false;
}else{
System.out.println("amount "+amount+" withdrawn succcessfully");
balance-=amount;
return true;
}
}
abstract String generateCheque(double amount);
abstract void depositCheque();
public String toString(){
return "the accno is "+accno+" name is "+name+" the account type is "+type+" the balance is "+balance;
}
}
class SavingAccount extends Account{
double rate=7;
SavingAccount(String name,int age){
super(name,age);
this.type="Saving";
}
void CalcInterest(int year){
double interest=balance *year*rate/100;
System.out.println("the compound interest is "+interest);
balance += interest;
}

 String generateCheque(double amount){
return "service not available in saving account";
}
 void depositCheque(){
System.out.println("service not available in saving account");
}
}
class CurrentAccount extends Account{
CurrentAccount(String name,int accno){
super(name,accno);
this.type="Current";
}
String generateCheque(double amount){
return "cheque generated "+accno +" and name is "+name+" amount is "+amount;
}
void depositCheque(){
deposit();
System.out.println("the cheque deposited successfully");
}
boolean withdraw( double amount){
if(super.withdraw(amount)){
	if(this.balance<2000){
		this.balance-=100;
	System.out.println("100 rupees deducted as penalty");

}
return true;
}else{
return false;
}
}
}