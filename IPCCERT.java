import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); 
		int M = sc.nextInt(); 
		int K = sc.nextInt(); 

		int count = 0;

		for (int i = 0; i < N; i++) {
			int sum = 0;

			for (int j = 0; j < K; j++) {
				sum += sc.nextInt(); 
			}

			int q = sc.nextInt(); 

			if (sum >= M && q <= 10) {
				count++;
			}
		}

		System.out.println(count);
	}
}
