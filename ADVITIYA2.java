import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int a[] = new int[5];
		    int sum = 0;
		    for(int i=0; i<5; i++)
		    {
		        a[i]=sc.nextInt();
		        if( a[i]==1)
		        sum++;
		    }
		    if(sum>=4) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
