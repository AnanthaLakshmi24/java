import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0)
		{
		int N=s.nextInt();
		int X=s.nextInt();
		
		int evenCount=N/2;
		int oddCount=(N+1)/2;
		
		if(X%2==0){
		    System.out.println(evenCount -1);
		}
		else{
		    System.out.println(oddCount -1);
		}
		    
		}

	}
}
