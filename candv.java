import java.util.*;
public class candv
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String c="";
String v="";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
{
v=v+s.charAt(i);
}
else
{
c=c+s.charAt(i);
}
}
System.out.println(v);
System.out.println(c);
}
}