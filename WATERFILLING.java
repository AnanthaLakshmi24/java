/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    if(a==0&&b==0||b==0&&c==0||a==0&&c==0)
		    System.out.println("Water filling time");
		    else
		    System.out.println("Not now");
		    
		}
	}
}

