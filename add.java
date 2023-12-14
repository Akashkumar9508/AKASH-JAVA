import java.util.Scanner;

class Add{
    public static void main(String[] args) {
        System.out.println("enter two numberas ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        sc.close();
    }
}