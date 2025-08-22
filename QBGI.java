import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int b = 0, g = 0, cnt = 0;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'B') b++;
                else g++;

                cnt++;

                if (g == 0 && b > 0) break;
                if (b > 2 * g) break;
            }

            System.out.println(cnt);
        }
	}
}
