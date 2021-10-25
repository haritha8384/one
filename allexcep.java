public class allexcep
{
public static void main(String args[])
{
int age=8;
if(age>20)
//if(age<20)
{
throw new ArithmeticException("invalid age");//using throw keyword
}
try //one try many catch blocks
{
//int h3[]=new int[2];
//System.out.println(h3[3]);
//int h1=20/0;
//System.out.println(h1);
String h4=null;
//String h4="haritha";
System.out.println(h4.length());
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" invalid index number ");
}
catch(ArithmeticException ee)
{
System.out.println(" invalid arithematic operation ");
}
catch(NullPointerException e)
{
System.out.println("invalid string length");
}
}
}