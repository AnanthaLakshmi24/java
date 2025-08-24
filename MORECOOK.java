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
		while(t-->0){
		    int N = sc.nextInt();
		    int C = sc.nextInt();
		    int A[] = new int[N];
		    for(int i=0;i<N;i++){
		        A[i] = sc.nextInt();
		    }
		    int extracookies =0;
		    while(true){
		        boolean less = false;
		        boolean equal = false;
		        for(int i=0;i<N;i++){
		            if(A[i] < C+extracookies){
		                less = true;
		            }
		            if(A[i] == C + extracookies){
		                equal = true;
		                break;
		            }
		        }
		        if(less && !equal){
		            System.out.println(extracookies);
		            break;
		        }
		        else{
		            extracookies++;
		        }
		    }
		}

	}
}
