import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int ep=sc.nextInt();
            int min=sc.nextInt();
            
            int time=ep*min;
            int num1=0;
            int num2=time;
            while(time>=60){
                num1++;
                num2=num2-60;
                time-=60;
            }
            System.out.println(num1+" "+num2);
        }
	}
}
