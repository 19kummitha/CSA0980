import java.util.*;
class vandc
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int C=0;
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.print("vowels:"+c+" ");
}
else
{
System.out.println("consonents:"+c+" ");
}
}
}
}