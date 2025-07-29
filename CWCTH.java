import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();  // clouds in morning
        int B = sc.nextInt();  // clouds in evening

        if (B >= 3 * A) {
            System.out.println("Rain");
        } else {
            System.out.println("Dry");
        }// your code goes here

	}
}
