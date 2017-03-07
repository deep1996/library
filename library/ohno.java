import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class deep extends JFrame{
static JTextField name,space1;
JLabel gap;
static JButton ok;

public deep(){
super("LIBRARY");
setLayout(new FlowLayout());

name=new JTextField("Please Enter Roll No.");
name.setEditable(false);
add(name);
space1=new JTextField(20);
add(space1);
gap=new JLabel("                                                                                                                                                                                                                                                                                                                                                            ");
add(gap);
ok=new JButton("OK");
add(ok);
and w=new and();
ok.addActionListener(w);

}
}
class howthe{
static int l;
static String g="",j="";
public static void hotel(){
try{
FileReader a=new FileReader("roll.txt");
BufferedReader b=new BufferedReader(a);
 
if((g=b.readLine())!=null)
{j=g;}
b.close();
}catch(Exception e){}
l=Integer.parseInt(j);
}
}


class and implements ActionListener{
static int z;
public void actionPerformed(ActionEvent event){
try{
z=Integer.parseInt(deep.space1.getText());
}catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"PLEASE ENTER AN INTEGER!");
return;}
howthe.hotel();
if(event.getSource()==deep.ok&&(howthe.l-1)>=z)
{ohno.y.dispose();
ohno.y=null;
fun.run();

}

}
}
public class ohno{
static deep y;
public static void run(){
 y=new deep();

y.setSize(400,200);
y.setVisible(true);
}

public static void main (String [] args) {

run();

}

}


