import java.util.*;
public class specialchar
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i))|| Character.isAlphabetic(s.charAt(i)))
{
continue;
}
if(Character.isDigit(s.charAt(i))&&Character.isAlphabetic(s.charAt(i)))
{
continue;
}
else
{
count +=1;
System.out.println(s.charAt(i));
}
}
System.out.println(count);
}
}