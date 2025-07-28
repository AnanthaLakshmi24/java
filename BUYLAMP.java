import java.util.Scanner;

 class BuyLamps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Total number of lamps to buy
            int K = sc.nextInt(); // Minimum number of red lamps
            int X = sc.nextInt(); // Cost of a red lamp
            int Y = sc.nextInt(); // Cost of a blue lamp

            // Calculate the minimum cost
            int cost;
            if (X <= Y) {
                // If red lamps are cheaper or equal in price to blue lamps,
                // buy all lamps as red
                cost = N * X;
            } else {
                // If blue lamps are cheaper, buy exactly K red lamps and the rest as blue
                cost = (K * X) + ((N - K) * Y);
            }

            // Output the result
            System.out.println(cost);
        }

        sc.close();
    }
}
