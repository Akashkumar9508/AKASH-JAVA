 import java.util.Scanner;

class twod{
    public static void main(String[] args){
        System.out.println("enter the row & COLUMN");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int numbers[][] =new int [row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
            numbers[i][j]=sc.nextInt();
            } 
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
            System.out.print(numbers[i][j]+" ");
            } 
            System.out.println();
        }
        sc.close(); 
    }
}