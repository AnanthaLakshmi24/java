import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
       Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int C=sc.nextInt();
         int area_rec=A*B;
         int ares_sq=C*C;
         if(area_rec==ares_sq)
         {
             System.out.println("YES");
         }
         else
         {
             System.out.println("NO");
         }
	}
}
