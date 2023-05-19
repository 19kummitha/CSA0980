import java.util.*;
class collections1
{
public static void main(String[]args)
{
ArrayList<String> list=new ArrayList<String>();
list.add("koti");
list.add("kiran");
list.add("yella");
list.add("naveen");
list.add("ganesh");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.print(itr.next());
}
Collections.sort(list);
System.out.println(list);
}
}