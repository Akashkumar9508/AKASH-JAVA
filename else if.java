
import java.util.*;

class D {
    public static void main(String[] agrs) {
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        sc.close();
    }

}
