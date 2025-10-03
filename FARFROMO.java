/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int a = read.nextInt();
		    int b = read.nextInt();
		    int c = read.nextInt();
		    int d = read.nextInt();
		    double x = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		    double y = Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2));
		    if(x>y){
		        System.out.println("ALEX");
		    }
		    else if(x<y){
		        System.out.println("BOB");
		    }
		    else{
		        System.out.println("EQUAL");
		    }
		}
	}
}
