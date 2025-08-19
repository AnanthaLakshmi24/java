import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		
Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        while (T-- > 0) {
            int X = sc.nextInt(); 
           
            while (X > 3) {
                X -= 3;
            }
            if (X % 2 == 0) {
                X /= 2;
            }
            
            System.out.println(X); 
        }
        
        sc.close();
	}
}
