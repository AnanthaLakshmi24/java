/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++)
		{
		    int n=sc.nextInt();
		    int left=100-n;
		    int last = left%10;
		    if(last==0 || last==1 || last==2 || last==3 || last==4 || last==5)
		    {
		        System.out.println(left-last);
		    }
		    else
		    {
		        System.out.println(left-last+10);
		    }
		}
	}
}
