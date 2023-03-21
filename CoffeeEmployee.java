import javax.swing.*;
import java.awt.*;
public class CoffeeEmployee{
public static void main(String[]args)
{String s;
int c;

s=JOptionPane.showInputDialog("Enter A Number:(1)CoffeeBar\n\t\t(2)Payment");
c=Integer.parseInt(s);

if(c==1)
{int n;
int p=0;
int q;
int tp=0;
s=JOptionPane.showInputDialog("Choose Coffee\n(1)Americano--2000kyats\n(2)Espresso--1500kyats\n(3)Mocha--2500kyats\n(4)Capuccino--2500kyats");
n=Integer.parseInt(s);
if(n==1){p=2000;}
if(n==2){p=1500;}
if(n==3){p=2500;}
if(n==3){p=2500;}
s=JOptionPane.showInputDialog("Enter Quantity");
q=Integer.parseInt(s);

tp=q*p;
System.out.println("Total Amount="+tp);
}
if(c==2)
{int e;
int a=0;
int wh;
int ts;
s=JOptionPane.showInputDialog("Choose Position:\n(1)Manager\n(2)Accountant\n(3)Secretary\n(4)Security");
e=Integer.parseInt(s);
if(e==1){a=6000;}
if(e==2){a=4500;}
if(e==3){a=5000;}
if(e==4){a=3500;}
s=JOptionPane.showInputDialog("Enter Working Hour:");
wh=Integer.parseInt(s);

ts=a*wh;
System.out.println("Total Salary="+ts);
}
}
}