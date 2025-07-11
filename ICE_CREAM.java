import java.util.Scanner;

 class IceCream {
    public static void main(String[] args) {
        // Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read X (price of one ice cream) and Y (money Chef has)
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Check if Chef can buy 2 ice creams
        if (Y >= 2 * X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Close the scanner
        scanner.close();
    }
}

