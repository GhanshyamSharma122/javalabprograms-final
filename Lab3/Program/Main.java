import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the amount of books you want to enter");
Book[] books;
int n=scan.nextInt();
books =new Book[n];
for(int i=0;i<n;i++){
System.out.println("enter the details for Book no. "+(i+1));
System.out.println("enter name author price and number of pages");
books[i]=new Book(scan.next(),scan.next(),scan.nextDouble(),scan.nextInt());
}
System.out.println("now the details of the entered books are:-");
for(int i=0;i<n;i++){
System.out.println(books[i]);
}
//demo of getters and setters
Book b1=new Book("ram","Shyam",123.23,120);
System.out.println(b1);
b1.setName("karan");
b1.setPrice(423.45);
b1.setNum_pages(500);
System.out.println(b1.getName());
System.out.println(b1);
}
}
class Book{
String name;
String author;
double price;
int num_pages;
Book(String name,String author,double price,int num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
void setName(String name){
this.name=name;
}
void setAuthor(String author){
this.author=author;
}
void setPrice(double price){
this.price=price;
}
void setNum_pages(int num_pages){
this.num_pages=num_pages;
}
String getName(){
return name;
}
String getAuthor(){
return author;
}
double getPrice(){
return price;
}
int getNum_pages(){
return num_pages;
}
public String toString(){
return "the name is "+name+" the price is "+price+" the author of book is "+author+" the no of pages is "+num_pages;
}

}