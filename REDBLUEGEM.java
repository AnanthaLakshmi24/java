import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int k = p*r;
		int l = q*s;
		System.out.println(Math.max(k,l));
        sc.close();
	}
}
