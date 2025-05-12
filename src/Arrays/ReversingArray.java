package Arrays;
import java.util.*;
public class ReversingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // here we take the size of array
        int n = sc.nextInt();
        // declaring the array
        int[] arr = new int[n];
        // input for the array
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        reverseArr_1(arr,n);  // method 1
        printArr(arr);
    }
    // method 1 --> using simple for loop
    public static void reverseArr_1(int[] arr, int n){
        for(int j=0;j<n/2;j++){
            int temp = arr[j];
            arr[j] = arr[n-j-1];
            arr[n-j-1] = temp;
        }
    }
    // method 2 --> using 2 pointers

    // printing the array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
