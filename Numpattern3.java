public class ReverseNumberPattern {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
