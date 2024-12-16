class Main{
public static void main(String[] args){
BMS b=new BMS();
CSE c=new CSE();
b.start();
c.start();
}

}
class BMS extends Thread{
public void run(){
while(true){
System.out.println("BMS college of Engineering");
try{
Thread.sleep(10000);

}catch(Exception e){}
}

}

}
class CSE extends Thread{
public void run(){
while(true){
System.out.println("CSE");
try{
Thread.sleep(2000);

}catch(Exception e){}
}

}

}