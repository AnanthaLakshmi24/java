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
            int r = sc.nextInt();
		    int g = sc.nextInt();
		    int b = sc.nextInt();
		    if(r<=g+b && g<=r+b && b<=g+r)
		    {
		        System.out.println("YES");
		    }
		    else System.out.println("NO");
		    
		}

	}
}
