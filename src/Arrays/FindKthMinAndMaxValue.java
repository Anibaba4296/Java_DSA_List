package Arrays;
import java.util.*;
public class FindKthMinAndMaxValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        minAndMax(arr,k);
    }
    public static void minAndMax(int[] arr, int k){
        if(arr == null || arr.length == 0 || k <= 0){
            System.out.println("Invalid inputs");
            return;
        }

        // here we will use TreeSet to remove duplicates and sort the array
        TreeSet<Integer> sortedArray = new TreeSet<>();
        for(int x:arr){
            sortedArray.add(x);
        }

        if(sortedArray.size() < k){
            System.out.println("No sufficient element to perform action");
            return;
        }

        // converting TreeSet to list so that we will be able to access index wise
        List<Integer> list = new ArrayList<>(sortedArray);
        System.out.println(k + "th min value is " + list.get(k-1));
        System.out.println(k + "th max value is " + list.get(list.size()-k));
    }
}
