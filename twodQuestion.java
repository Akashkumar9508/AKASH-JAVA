import java.util.Scanner;

class twodarray{
    public static void main(String[] args){
        System.out.println("enter the row , COLUMN");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int numbers[][] = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                if(x==numbers[i][j]){
                    System.out.println("x found at ("+i+","+j+")");

                }
            }
        }
        sc.close();
    }
}