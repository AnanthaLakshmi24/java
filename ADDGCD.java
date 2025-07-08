import java.util.*;
class Main {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int curr = b;
            b = a % b;
            a = curr;
        }
        return a;
    }
    public static int getMin(int X, int Y) {
        
        if(gcd(X, Y) > 1) return 0;
        else if(gcd(X+1, Y) > 1 || gcd(X, Y+1) > 1) return 1;
        else return 2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int op = getMin(X, Y);
            
            System.out.println(op);
        }
    }
}