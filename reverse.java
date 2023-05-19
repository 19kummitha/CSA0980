import java.util.*;
class reverse
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String s=sc.nextLine();
String str="";
System.out.println("the reversed string:");
for(int i=s.length()-1;i>=0;i--)
{
str=str+s.charAt(i);
}
System.out.println(str);
}
}