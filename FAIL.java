import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int N = sc.nextInt();
		    
		    int sum = 0;
		    boolean scholar = false;
		    
		    for(int i=0; i<N; i++){
		        int scores = sc.nextInt();
		        sum += scores;
		        double average = (double)sum/(i+1);
		        if(average < 40){
		            scholar = true;
		        }
		    }
		    System.out.println(scholar ? "NO" : "YES");
		}

	}
}
