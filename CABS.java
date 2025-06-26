/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in); 
	    int n=s.nextInt(); 
	    while(n>0){
	        int a= s.nextInt(); 
	        int b=s.nextInt(); 
	        if(a>b) 
	        System.out.println("SECOND"); 
	        else if(a<b) 
	        System.out.println("FIRST"); 
	        else 
	        System.out.println("ANY");
	n--;
	    }
		// your code goes here
	}
}
