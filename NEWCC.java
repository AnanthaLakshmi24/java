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
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	if(a<b){
	    System.out.println("old");
	}
	else if(b<a){
	    System.out.println("New");
	}
	else{
	    System.out.println("Same");
	}
	}
}