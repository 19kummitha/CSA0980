import java.util.*;
public class reversealpha
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=s.length();
for(char i='z';i>='a';i--)
{
for(int j=0;j<n;j++)
{
if(i==s.charAt(j))
{
System.out.print(i);
}
}
}
}
}