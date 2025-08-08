import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int diff = Integer.MAX_VALUE;
            boolean found = false;

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    int peri = 2 * (i + j);
                    if (peri <= K) {
                        found = true;
                        diff = Math.min(diff, K - peri);
                    }
                }
            }
            if (!found) {
                System.out.println(4 - K);
            } else {
                System.out.println(diff);
            }
        }

    }
}