import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calcul implements ActionListener{
    JButton[] jb=new JButton[10];
    
    JButton add,sub,mul,div,clr,dec,eq;
    JPanel jp=new JPanel();
    JTextField jtf=new JTextField();
    JFrame jf=new JFrame("CALCULATOR");
    char opr=' ';
    int num1=0,num2=0;
    public calcul() {
        for(int i=0;i<10;i++)
        jb[i]=new JButton(String.valueOf(i));
        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("x");
        div=new JButton("/");
        clr=new JButton("CLR");
        dec=new JButton(".");
        eq=new JButton("=");
        jtf.setBounds(200,150,500,50);
        jp.setLayout(new GridLayout(5,3));
        jp.setBounds(200,200,450,450);
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jp.add(jb[1]);
        jp.add(jb[2]);
        jp.add(jb[3]);
        jp.add(add);
        jp.add(jb[4]);
        jp.add(jb[5]);
        jp.add(jb[6]);
        jp.add(sub);
        jp.add(jb[7]);
        jp.add(jb[8]);
        jp.add(jb[9]);
        jp.add(mul);
        jp.add(div);
        jp.add(dec);
        jp.add(jb[0]);
        jp.add(clr);
        jp.add(eq);
        jb[0].addActionListener(this);
        jb[1].addActionListener(this);
        jb[2].addActionListener(this);
        jb[3].addActionListener(this);
        jb[4].addActionListener(this);
        jb[5].addActionListener(this);
        jb[6].addActionListener(this);
        jb[7].addActionListener(this);
        jb[8].addActionListener(this);
        jb[9].addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clr.addActionListener(this);
        dec.addActionListener(this);
        eq.addActionListener(this);
        


        jf.add(jtf);
        jf.add(jp);
        jf.setVisible(true);


    }
    public  void actionPerformed(ActionEvent e)
    {
        int val=0;
        
        for(int i=0;i<10;i++){
        if(e.getSource()==jb[i])
         {
            jtf.setText(jtf.getText().concat(String.valueOf(i)));
            
         }
    }
    if(e.getSource()==add)
    {
        num1=Integer.parseInt(jtf.getText());
        jtf.setText("");
        opr='+';

    }
    if(e.getSource()==sub)
    {
        num1=Integer.parseInt(jtf.getText());
        jtf.setText("");
        opr='-';
    }
    if(e.getSource()==mul)
    {
        num1=Integer.parseInt(jtf.getText());
        jtf.setText("");
        opr='*';
    }
    if(e.getSource()==div)
    {
        num1=Integer.parseInt(jtf.getText());
        jtf.setText("");
        opr='/';
    }
    if(e.getSource()==clr)
    {
        
        jtf.setText("");
        num1=num2=0;
    }
    if(e.getSource()==dec)
    {
       
        jtf.setText(jtf.getText().concat("."));

    }
    if(e.getSource()==eq)
    {
       num2=Integer.parseInt(jtf.getText());
        

    
    switch(opr)
    {
       case '+':
       val=num1+num2;
       jtf.setText(String.valueOf(val));
       break;
       case '-':
       val=num1-num2;
       jtf.setText(String.valueOf(val));
       break;
       case '*':
       val=num1*num2;
       jtf.setText(String.valueOf(val));
       break;
       case '/':
       val=num1/num2;
       jtf.setText(String.valueOf(val));
       break;
    }
}
}
public static void main(String args[])
{   calcul c=new calcul();
    
}


}  