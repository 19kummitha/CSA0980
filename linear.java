import java.util.*;
public class linear
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int flag=0,c=0;
char ch=sc.next().charAt(0);
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==ch)
{
flag=1;
c=i;
}
}
if(flag==1)
{
System.out.println(ch+"is found in string at index"+c);
}
else
{
System.out.println(ch+"is not found in the string");
}
}
}