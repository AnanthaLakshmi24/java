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
		    if(a==0){
		        System.out.println("Liquid");
		    }
		    else if(b==0){
		        System.out.println("Solid");
		    }
		    else{
		        System.out.println("Solution");
		    }
		}
	}
}
