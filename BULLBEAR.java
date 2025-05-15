import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
		    int A=scan.nextInt();
		    int B=scan.nextInt();
		    if (A>B){
		        System.out.println("LOSS");
		    }
		    else if (A==B){
		        System.out.println("NEUTRAL");
		    }
		    else{
		        System.out.println("PROFIT");
		    }
		}
	}
}
