package Arrays;
import java.util.*;
public class RotateArrayByOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Here we will rotate the array by in right shift manner
        // 1 2 3 4 5  --> I/P
        // 5 1 2 3 4  --> O/P

        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
