import java.io.*;
import java.util.*;
class studentreport
{
public static void main(String args[])
{
int a,b,c,d,e,tot,avg;
Scanner p=new Scanner(System.in);
System.out.println("enter the name of the student");
String name=p.nextLine();
System.out.println("enter the register number");
reg=p.nextInt();
System.out.println("enter the marks of the students");
a=p.nextInt();
b=p.nextInt();
c=p.nextInt();
d=p.nextInt();
e=p.nextInt();
tot=a+b+c+d+e;
double avg=tot/5;
System.out.println("the total  is"+tot);
System.out.println("the  average is"+avg);
}
}