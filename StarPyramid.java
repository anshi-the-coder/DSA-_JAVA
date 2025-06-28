public class StarPyramid {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
