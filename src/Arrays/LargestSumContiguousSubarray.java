package Arrays;
import java.util.*;
public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        int crr=0, maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            crr = crr + arr.get(i);
            maxSum = Math.max(crr,maxSum);
            if(crr<0){
                crr=0;
            }
        }
        System.out.println(maxSum);
    }
}
