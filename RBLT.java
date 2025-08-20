import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int count_red = 0;
            int count_blue = 0;
            int count_zero = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) count_red++;
                else if (arr[i] == 2) count_blue++;
                else if (arr[i] == 0) count_zero++;
            }

            while (count_zero > 0) {
                if (count_blue > count_red) {
                    count_red++;
                } else {
                    count_blue++;
                }
                count_zero--;
            }

            if (count_blue == count_red) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
