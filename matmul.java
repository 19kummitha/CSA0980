import java.util.*;
public class matmul
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,k;
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int c[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("a matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("b matrix:");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=0;
for(k=0;k<n;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
System.out.println("c matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}