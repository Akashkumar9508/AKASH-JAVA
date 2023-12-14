import java.util.*;

public class AC_Q1 {
   // public static void average(int x,int y,int z){
   //     float sum=(x+y+x)//3;
   //     System.out.println(sum);
   // }
    public static void main(String[] args)
    {
        System.out.println("ecter three numbers:-");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       int average=(a+b+c)/3;
       System.out.println(average+" is the average of "+a+","+b+","+c);
       sc.close();
    }
}
