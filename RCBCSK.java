import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
	    	Scanner sc = new Scanner(System.in);
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = x-y;
		    if (k>=18){
		        System.out.println("RCB");
		    }
		    else{
		        System.out.println("CSK");
		    }
		    

	}
}
