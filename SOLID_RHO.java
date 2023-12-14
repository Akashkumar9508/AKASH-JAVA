public class SOLID_RHO {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int a = 1; a <= n; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}