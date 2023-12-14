import java.util.*;

class C {
    public static void main(String[] args) {
        System.out.println("enter your no.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("odd");
        }
sc.close();
    }
}
