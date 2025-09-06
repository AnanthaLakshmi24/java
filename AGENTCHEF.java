/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            
            int X = sc.nextInt();
            
            
            int minimumInsurances = (int) Math.ceil(100.0 / (X * 0.2));
            
            
            System.out.println(minimumInsurances);
        }
        
        sc.close();
}
}
