import java.util.*;
public class reverse
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String str="";
for(int i=s.length()-1;i>=0;i--)
{
str+=s.charAt(i);
}
System.out.println(str);
}
}