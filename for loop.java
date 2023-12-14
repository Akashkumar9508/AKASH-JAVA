import java.util.*;

class D {
    public static void main(String[] agrs) {
        System.out.println("enter your term");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
            
    
    }

}