import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner Tax = new Scanner(System.in);
        int T = Tax.nextInt();
        while(T -->0){
            int X = Tax.nextInt();
            if (X > 100){
                System.out.println(X - 10);
            }
            else if (X <= 100){
                System.out.println(X);
            }
        }
	}
}
