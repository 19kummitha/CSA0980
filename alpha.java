import java.util.*;
public class alpha
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
char ch=sc.next().charAt(0);
if(ch=='A')
{
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
String temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
else if(ch=='D')
{
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])<0)
{
String temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
}