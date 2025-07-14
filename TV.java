import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		int i,c=0;
		for(i=1;i<=x;i++)
		{
		    if((i%2)!=0)//1,2,3,4,5
		    {
		        c++;
		    }
		}
        System.out.println(c);
	}
}
