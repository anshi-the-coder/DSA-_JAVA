//     *
//    * *
//   *   *
//  *     *
// *********

public class HollowStarTriangle {
    public static void main(String[] args) {
        int n = 5; // height of the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars and spaces inside the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                // First or last star in the row, or the last row (print *)
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}
