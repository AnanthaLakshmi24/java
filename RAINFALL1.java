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
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    int x = s.nextInt();
		    if(x<3){
		        System.out.println("LIGHT");
		    }else if(x>=3 && x<7){
		        System.out.println("MODERATE");
		    }else{
		        System.out.println("HEAVY");
		    }
		    t--;
		}
	}
}
