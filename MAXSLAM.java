import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		// your code goes here
        int a=sc.nextInt();
        if((25-a)%4==0){
        System.out.println((25-a)/4);
	}
	   else{
	       System.out.println(((25-a)/4)+1);
	   } 
	}
}
