import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int g = sc.nextInt(), //acceleration due to gravity 
                c = sc.nextInt(); //speed of light
            //min height=c squre/2 *g
            System.out.println((c * c) / (2 * g));
        }

    }
}