/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		
		Scanner sca= new Scanner(System.in);
		int t= sca.nextInt(); 
		
		while(t-->0) 
		{
		    int x= sca.nextInt();
		    int y= sca.nextInt();
		    int m= sca.nextInt();
		    if(x*m<y) 
		    {
		        System.out.println("yes");
		    }else 
		    {
		        System.out.println("no");
		    }
		}
	}
}
