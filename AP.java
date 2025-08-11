import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t = 0; t < T; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if(x + z == 2*y) System.out.println(0);
			else if(x + z < 2*y) System.out.println(1);
			else System.out.println(1);
		}
	}
}
