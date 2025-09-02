import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = m % n;
            if (x == 0) System.out.println(0);
            else if(x < (n/2 + 1)){
                if(n < m) System.out.println(x);
                else System.out.println(n-x);
            }
            else{
                System.out.println(n-x);
            }

        }
    }
}