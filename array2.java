import java.util.Scanner;

public class array2 {
    public static void main(String args[]) {
        System.out.println("enter the terms= ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
//input loop
System.out.println("input values");
        for(int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
//output loop
System.out.println("outputing values");
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
        sc.close();
    }
}