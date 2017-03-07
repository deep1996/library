//first divide
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class hope extends JFrame{
JLabel a;
static JButton b,c,d,change;
GridLayout f;
Container g;
public hope(){
super("LIBRARY");
f=new GridLayout(5,0);
g=getContentPane();
setLayout(f);

a=new JLabel("Choose an Action");
add(a);
b=new JButton("STUDENTS");
add(b);
c=new JButton("BOOKS");
add(c);
d=new JButton("SUGGESTION");
add(d);
change=new JButton("CHANGE PASSWORD");
add(change);
it z=new it();
b.addActionListener(z);
c.addActionListener(z);
d.addActionListener(z);
change.addActionListener(z);

}
}
class it implements ActionListener{
public void actionPerformed(ActionEvent event){

if(event.getSource()==hope.b)
{sun.run();}
if(event.getSource()==hope.c)
{bun.run();}
if(event.getSource()==hope.d)
{suggestion.run();}
if(event.getSource()==hope.change)
{again2.run();}

//add something

}
}
public class one{
public static void run(){



hope y=new hope();
y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
y.setSize(400,200);
y.setVisible(true);
}

public static void main (String [] args) {

run();

}

}