import java.util.Scanner;

public class AC_Q3 {
    public static void greater(int x,int b){
        System.out.println("enter two nunmbers :");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        b=sc.nextInt();
        if (x>b) {
            System.out.println(x+" is greater ");
        }
        else{
            System.out.println(b+" is gerater");
        }
        sc.close();
    }
    public static void main (String[] args){
        greater(0, 0);
    }
    
}
