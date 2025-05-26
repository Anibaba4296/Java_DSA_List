package Arrays;
import java.util.*;
public class NegativeValuesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int right = arr.length-1,left=0;
        while(left <= right){
            if(arr[left] < 0 && arr[right] < 0){
                left++;
            }else if(arr[left] >= 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else if(arr[left] >= 0 && arr[right] >= 0){
                right--;
            }else{
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
