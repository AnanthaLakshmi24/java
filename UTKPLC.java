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
		
		while(t-->0){
		    char first = sc.next().charAt(0);
		    char second = sc.next().charAt(0);
		    char third = sc.next().charAt(0);
		    
		    char x = sc.next().charAt(0);
		    char y = sc.next().charAt(0);
		    
		    if(x == third || (x == second && y == first)){
		        System.out.println(y);
		    }else{
		        System.out.println(x);
		    }
		}

	}
}
