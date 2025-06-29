import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int X,Y,T;
		Scanner s=new Scanner(System.in);
		X=s.nextInt();
		Y=s.nextInt();
		if(Y>1)
		{
		T=X+Y*10;
		System.out.println(T);
	}
	    else{
	        System.out.println(X);
	    }
}
}
