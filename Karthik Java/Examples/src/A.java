import java.util.*;
class A
{
public static void main(String args[])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
Integer a[]=new Integer[n];
ArrayList<Integer> e=new ArrayList<Integer>();
ArrayList<Integer> o=new ArrayList<Integer>();
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
if(a[0]%2==0)
{
for(i=0;i<n;i++)
{
if(a[i]%2==0)
{
e.add(a[i]);
}
else
{
o.add(a[i]);
}
}
}
else
{
for(i=0;i<n;i++)
{
if(a[i]%2!=0)
{
o.add(a[i]);
}
else
{
e.add(a[i]);
}
}
}
for(i=0;i<e.size();i++){
System.out.print(e.get(i)+" ");
System.out.print(o.get(i)+" ");
}
}
}