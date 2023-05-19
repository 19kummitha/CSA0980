import java.util.*;
class ascanddes
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
char order=sc.next().charAt(0);
if(order=='A')
{
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
String m=a[i];
a[i]=a[j];
a[j]=m;
}
}
}
System.out.println(Arrays.toString(a));
}
if(order=='D')
{
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])<0)
{
String m=a[i];
a[i]=a[j];
a[j]=m;
}
}
}
System.out.println(Arrays.toString(a));
}
}
}