import java.util.*;

public class method02 {
    public static int calculatesum(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);
        System.out.println(sum);
        sc.close();
    }
}
