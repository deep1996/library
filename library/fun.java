import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
class ave{
static String[] str;
static String fileName;
public static void lve(){
int i=0;
 str=new String[6];
try{

fileName = and.z+ ".txt";
FileReader a=new FileReader(fileName);
BufferedReader b=new BufferedReader(a);
String s;

while((s = b.readLine()) != null)
{

 str[i]=s;
 i++;
}

b.close();
}catch(Exception e){} 
}
}



class cut extends JFrame{
static JLabel roll,name,address,ohh,school,mob,mail;
static JTextField space1,space2,space3,space4,space5,space6,space7;
GridLayout g;
static JButton submit,borrow,ret,history;
public cut(){
super("library");
g=new GridLayout(9,2);
setLayout(g);
roll=new JLabel("ROLL NO.");

add(roll);
space7=new JTextField(deep.space1.getText());
space7.setEditable(false);
add(space7);
name=new JLabel("NAME");

add(name);
space1=new JTextField(ave.str[0]);
add(space1);

ohh=new JLabel("CLASS");

add(ohh);
space3=new JTextField(ave.str[1]);
add(space3);

school=new JLabel("SCHOOL");

add(school);
space4=new JTextField(ave.str[2]);
add(space4);

address =new JLabel("ADDRESS");

add(address);
space2=new JTextField(ave.str[3]);
add(space2);

mob=new JLabel("CONTACT NO.");

add(mob);
space5=new JTextField(ave.str[4]);
add(space5);

mail=new JLabel("EMAIL ID");

add(mail);
space6=new JTextField(ave.str[5]);
add(space6);

submit=new JButton("DONE");
add(submit);
borrow=new JButton("BORROW BOOKS");
add(borrow);
ret=new JButton("RETURN BOOKS");
add(ret);
history=new JButton("HISTORY");
add(history);
nun no=new nun();
submit.addActionListener(no);
borrow.addActionListener(no);
ret.addActionListener(no);
history.addActionListener(no);
}
}
class fun{
static cut x;
public static void run(){
ave.lve();
x=new cut();
x.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
x.setSize(400,400);
x.setVisible(true);

}
public static void main(String[]args){

run();}
}
class nun implements ActionListener{
public void actionPerformed(ActionEvent event){
String z="";

if(event.getSource()==cut.submit&&!(cut.space1.getText().equals("")))
{
fun.x.dispose();

try{



File f = new File(ave.fileName);
f.delete();
FileWriter p=new FileWriter(new File(cut.space7.getText()+".txt"));
BufferedWriter q=new BufferedWriter(p);
PrintWriter r=new PrintWriter(q);

r.println(cut.space1.getText());

r.println(cut.space3.getText());

r.println(cut.space4.getText());

r.println(cut.space2.getText());

r.println(cut.space5.getText());

r.println(cut.space6.getText());
r.close();

}catch(Exception e){

System.out.println(e.getMessage());
e.printStackTrace();
}

}
 if(event.getSource()==cut.submit&&(cut.space1.getText().equals("")))
{JOptionPane.showMessageDialog(null,"INVALID OPERATION!");}

man7.more7();
 if(event.getSource()==cut.borrow&&(man7.k.equals("")))
{forever2.run();
}
if(event.getSource()==cut.borrow&&!(man7.k.equals("")))
{JOptionPane.showMessageDialog(null," OOPS! BOOKS HAVE ALREADY BEEN BORROWED");}












if(event.getSource()==cut.ret&&!(man7.k.equals("")))
{man3.run();}
if(event.getSource()==cut.ret&&(man7.k.equals("")))
{JOptionPane.showMessageDialog(null,"no books borrowed");}
if(event.getSource()==cut.history)
{

face3.run();
}


}
}


class man7 {
	static String k;
	
	public static void more7(){
	k="";
	String s;
	try{
	FileReader a=new FileReader(cut.space7.getText()+"a.txt");
	BufferedReader b=new BufferedReader(a);
	
	while((s=b.readLine())!=null)
	{k=k+s;}
	b.close();
	}catch(Exception e){}
	}
}


