import java.util.Scanner;

public class method_functiuon01 {
    public static void printName(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        // syntax= returnType functionName(type args1,type args2,type args3...){
        //    operatiions
        //   }
        System.out.println("enter your name:");
            Scanner Sc=new Scanner(System.in);
            String name=Sc.next();
            System.out.println( name);
            Sc.close();
    }
    
}