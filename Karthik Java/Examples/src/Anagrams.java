import java.util.*;
public class Anagrams
{
public static void main(String args[])
{
String s1,s2;
Scanner sc=new Scanner(System.in);
s1=sc.nextLine();
s2=sc.nextLine();
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
if(Arrays.equals(c1,c2))
System.out.println("yes");
else
System.out.println("no");
}
}