import java.util.*;
public class PatternForM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input for height of the pattern (should be odd for a proper "M")

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // First and last column
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                }
                // Left diagonal for "M"
                else if (i <= n / 2 + 1 && (i == j)) {
                    System.out.print("*\t");
                }
                // Right diagonal for "M"
                else if (i <= n / 2 + 1 && (i + j == n + 1)) {
                    System.out.print("*\t");
                }
                // Empty spaces
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
