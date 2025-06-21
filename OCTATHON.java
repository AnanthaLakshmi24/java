import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		float x=sc.nextFloat();
		if(x<3){
		    System.out.println("Gold");
		}
	    	else if(x>=3&& x<6)
	    {
	        System.out.println("Silver");
	    }
	    else{
	        System.out.println("Bronze");
	    }
    
	    }
}
