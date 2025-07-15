import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		if(X%2==0){
		    int half=X/2;
		    int total = X+half;
		    System.out.println(total);
		}

	}
}
