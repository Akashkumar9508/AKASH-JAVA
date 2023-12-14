
import java.util.Scanner;
class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<size;i++){
            System.out.println("Enter the element at " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elemnt you want to search(result = index)");
        int search_item = sc.nextInt();
        for(int i=0; i<size;i++){
            if (search_item == arr[i]){
                System.out.println("the index is "+ (arr[i]-1));
                break;
            }
        }
        sc.close();
    }
}