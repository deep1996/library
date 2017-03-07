import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class nope extends JFrame{
JLabel a;
static JButton b,c;
GridLayout g;
Container h;
public nope(){
super("LIBRARY");
g=new GridLayout(3,0);
h=getContentPane();
setLayout(g);

a=new JLabel("What To Do");
add(a);
b=new JButton("Add An Account");
add(b);
c=new JButton("Already Have An Account");
add(c);
is z=new is();
b.addActionListener(z);
c.addActionListener(z);
}
}
class is implements ActionListener{
public void actionPerformed(ActionEvent event){
String x="";
if(event.getSource()==nope.b)
{sun.y.dispose();
sun.y=null;
 start.run();}
if(event.getSource()==nope.c)
{sun.y.dispose();
sun.y=null;
ohno.run();
}
}
}
public class sun{
static nope y;
public static void run(){
 y=new nope();

y.setSize(400,200);
y.setVisible(true);
}

public static void main (String [] args) {

run();

}

}