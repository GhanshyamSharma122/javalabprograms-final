import javax.swing.*;
import java.awt.event.*;
class Main implements ActionListener{
static JLabel l3;
static JTextField t1,t2;
public static void main(String[] args){
JFrame frame =new JFrame("division of two numbers");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
JLabel l1=new JLabel("enter the first number");
JLabel l2=new JLabel("enter the second number");
l3=new JLabel("");
JPanel p=new JPanel();
t1=new JTextField(10);
t2=new JTextField(10);
JButton submit=new JButton("submit");
Main te=new Main();
submit.addActionListener(te);
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(submit);
frame.add(p);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s=e.getActionCommand();
if(s.equals("submit")){
try{
int num1=Integer.parseInt(t1.getText());
int num2=Integer.parseInt(t2.getText());
num1/=num2;
String ans="the answer of the division is "+num1;
l3.setText(ans);

}catch(Exception t){
JFrame frame=new JFrame ("error occured");
frame.setSize(300,100);
JLabel l1=new JLabel(t.toString());
frame.add(l1);
frame.setVisible(true);

}

}

}

}