/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int A=sc.nextInt();
            int B=sc.nextInt();
            if(A*10>B*5)
            System.out.println("FIRST");
            else if(B*5>A*10)
            System.out.println("SECOND");
            else
            System.out.println("ANY");
        }
	}
}

