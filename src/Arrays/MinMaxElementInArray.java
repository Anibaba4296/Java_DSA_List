package Arrays;
import java.util.*;
public class MinMaxElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input size of array
        int n = sc.nextInt();
        // declaring array
        int[] arr = new int[n];
        // input to the array
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // method 1 is using simple for loops O(n) time complexity
        int minValue = findMin(arr);
        int maxValue = findMax(arr);
        System.out.println("min : max == "+minValue+" : "+maxValue);

        // method 2 is to sort the array and return 1st and last element O(NlogN) time complexity
        Arrays.sort(arr);
        System.out.println("min : max == "+arr[0]+" : "+arr[arr.length-1]);
    }
    public static int findMin(int[] arr){
        int res = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < res){
                res = arr[i];
            }
        }
        return res;
    }
    public static int findMax(int[] arr){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > res){
                res = arr[i];
            }
        }
        return res;
    }
}
