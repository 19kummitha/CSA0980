import java.util.*;
class special
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int k=0;
char ch[]=new char[s.length()];
for(int i=0;i<s.length();i++)
{
if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i))&&!Character.isWhitespace(s.charAt(i)))
{
ch[k]=s.charAt(i);
k++;
}
}
for(int i=0;i<k;i++)
{
System.out.print(ch[i]);
}
System.out.println("the total number of special char:"+k);
}
}