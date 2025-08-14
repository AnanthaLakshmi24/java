/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh = new Scanner(System.in);
		int t = hh.nextInt();
		for(int i=0;i<t;i++){
		int x = hh.nextInt();
		int n = hh.nextInt();
		int z;
		if (n%100==0)
		    z=n/100;
		else
		    z=n/100+1;
		if(z>=x)
		System.out.println(z-x);
		else
		System.out.println(0);
	}
}
}