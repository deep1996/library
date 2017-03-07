import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
class but extends JFrame{
static JLabel name,address,ohh,school,mob,mail;
static JTextField space1,space2,space3,space4,space5,space6;
GridLayout g;
Container h;
static JButton submit;
public but(){
super("LIBRARY");
g=new GridLayout(7,2);
h=getContentPane();
setLayout(g);
name=new JLabel("NAME");

add(name);
space1=new JTextField(20);
add(space1);

ohh=new JLabel("CLASS");

add(ohh);
space3=new JTextField(20);
add(space3);

school=new JLabel("SCHOOL");

add(school);
space4=new JTextField(20);
add(space4);

address =new JLabel("ADDRESS");

add(address);
space2=new JTextField(20);
add(space2);


mob=new JLabel("CONTACT NO.");

add(mob);
space5=new JTextField(20);
add(space5);

mail=new JLabel("EMAIL ID");

add(mail);
space6=new JTextField(20);
add(space6);

submit=new JButton("SUBMIT");
add(submit);
soon no=new soon();
submit.addActionListener(no);
}
}
class start{
static but x;
public static void run(){

x=new but();

x.setSize(400,300);
x.setVisible(true);
}
public static void main(String[]args){
run();}
}
class soon implements ActionListener{
public void actionPerformed(ActionEvent event){
String z="";
if(event.getSource()==but.submit&&!(but.space1.getText().equals("")))
{String s,w="";
int j;
try{
FileReader a=new FileReader("roll.txt");
BufferedReader b=new BufferedReader(a);
if((s=b.readLine())!=null)
{w=s;}
b.close();
}catch(Exception e){}
j=Integer.parseInt(w);
JOptionPane.showMessageDialog(null,"Roll No. is "+(j));
try{
FileWriter k=new FileWriter("roll.txt");
BufferedWriter e=new BufferedWriter(k);
PrintWriter r=new PrintWriter(e);
int er=j+1;
r.print(er);
r.close();
}catch(Exception e){}


try{
FileWriter p=new FileWriter(new File(j+".txt"));
BufferedWriter q=new BufferedWriter(p);
PrintWriter r=new PrintWriter(q);
//System.out.println(but.space1.getText());

r.println(but.space1.getText());

r.println(but.space3.getText());

r.println(but.space4.getText());

r.println(but.space2.getText());

r.println(but.space5.getText());

r.println(but.space6.getText());
r.close();
}catch(Exception e){}
start.x.dispose();
start.x=null;
try{
	FileWriter p=new FileWriter(new File(j+"b.txt"));
	BufferedWriter q=new BufferedWriter(p);
	PrintWriter r=new PrintWriter(q);
	r.println("");
	r.close();
	}catch(Exception e){}


}else
{JOptionPane.showMessageDialog(null,"PLEASE ENTER NAME!");}
}
}