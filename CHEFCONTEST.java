import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t;
		t=s.nextInt();
		int i;
		for(i=1;i<=t;i=i+1)
		{
		    int x,y,p,q;
		    x=s.nextInt();
		    y=s.nextInt();
		    p=s.nextInt();
		    q=s.nextInt();
		    int j,k;
		    j=x+p*10;
		    k=y+q*10;
		    if(j==k)
		    {
		        System.out.println("Draw");
		    }
		    else
		    {
		        if(j>k)
		        {
		            System.out.println("Chefina");
		        }
		        else{
		            System.out.println("Chef");
		        }
		    }
		}

	}
}
