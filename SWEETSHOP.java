import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		int laddu =sc.nextInt();
		int x=price-(laddu*10);
		int y;
		if(x==0){
		    System.out.println(x);
		}
		else{
		    y=x/20;
		    System.out.println(y);
		}


	}
}
