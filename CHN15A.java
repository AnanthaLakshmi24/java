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
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-->0){
		    int n = scn.nextInt();
		    int k = scn.nextInt();
		    int[] n1 = new int[n];
		    int count = 0;
		    for (int i = 0;i<n ;i++ ){
		         n1[i] = scn.nextInt();
		    }
		    for (int j = 0;j<n ;j++ ){
		        n1[j] = n1[j]+k;
		        if (n1[j]%7==0)
		        count++;
		    } 
		            System.out.println(count);
		    
		        
		}
	}
}
