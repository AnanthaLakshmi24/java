import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n; i++){
		    int week=sc.nextInt();
		    int time=sc.nextInt();
		    int days=week*7;
		    System.out.println(days-time);
		}
	}
}
