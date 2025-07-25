import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    double p = sc.nextDouble();
		    double l = sc.nextDouble();
		    double a= (l/p)*100;
		    if(a>=75)
		    {
		        System.out.println("YES");
		        
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
