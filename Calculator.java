/*rahulbs_351 Simple Calculator*/
import java.awt.*;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
class Cal extends JFrame implements ActionListener
{
    JTextField f;
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton bp;
    JButton bmi;
    JButton bmu;
    JButton bd;
    JButton be;
    JButton bc;
    Cal()
    {
        setLayout(new FlowLayout());
        setTitle("Calculator");
        setSize(150,300);
        f=new JTextField();
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        bp=new JButton("+");
        bmi=new JButton("-");
        bmu=new JButton("*");
        bd=new JButton("/");
        be=new JButton("=");
        bc=new JButton("C");
        f.setBounds(5,5,100,20);
        f.setPreferredSize(new Dimension(100,20));
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bp.addActionListener(this);
        bmi.addActionListener(this);
        bmu.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        bc.addActionListener(this);
        add(f);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bp);
        add(bmi);
        add(bmu);
        add(bd);
        add(be);
        add(bc);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int n1,n2,result;
        String prev=f.getText();
        char op;
        if(ae.getSource()==b0)
            f.setText(prev+"0");
        else if(ae.getSource()==b1)
            f.setText("1");
        else if(ae.getSource()==b2)
            f.setText(prev+"2");
        else if(ae.getSource()==b3)
            f.setText(prev+"3");
        else if(ae.getSource()==b4)
            f.setText(prev+"4");
        else if(ae.getSource()==b5)
            f.setText(prev+"5"); 
        else if(ae.getSource()==b6)
            f.setText(prev+"6");
        else if(ae.getSource()==b7)
            f.setText(prev+"7");
        else if(ae.getSource()==b8)
            f.setText(prev+"8");
        else if(ae.getSource()==b9)
            f.setText(prev+"9");
        else if(ae.getSource()==bp)
            f.setText(prev+"+");
        else if(ae.getSource()==bmi)
            f.setText(prev+"-");
        else if(ae.getSource()==bmu)
            f.setText(prev+"*");
        else if(ae.getSource()==bd)
            f.setText(prev+"/");
        else if(ae.getSource()==bc)
            f.setText(null);
        else if(ae.getSource()==be)
        {
            n1=Character.getNumericValue(prev.charAt(0));
            n2=Character.getNumericValue(prev.charAt(2));
            op=prev.charAt(1);
            if(op=='+')
            {
                result=n1+n2;
                f.setText(Integer.toString(result));
            }
            else if(op=='-')
            {
                result=n1-n2;
                f.setText(Integer.toString(result));
            }
            else if(op=='*')
            {
                result=n1*n2;
                f.setText(Integer.toString(result));
            }
            else if(op=='/')
            {
                if(n2!=0)
                {
                    result=n1/n2;
                    f.setText(Integer.toString(result));
                }
                else
                {
                    f.setText("Error");
                }
            }
        }
        else
            f.setText("Error");
    }

}
public class Calculator
{
    public static void main(String args[])
    {
        Cal c=new Cal();
        c.setVisible(true);
    }
}