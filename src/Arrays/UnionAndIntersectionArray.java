package Arrays;
import java.util.*;
public class UnionAndIntersectionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("1st array input : ");
        for(int i=0;i<n1;i++){
            int temp = sc.nextInt();
            arr1.add(temp);
        }
        System.out.println("2nd array input : ");
        for(int i=0;i<n2;i++){
            int temp = sc.nextInt();
            arr2.add(temp);
        }
        HashSet<Integer> unionRes = UnionArray(arr1,arr2);
        HashSet<Integer> intersectRes = IntesectArray(arr1,arr2);
        System.out.println("Union of two arrays");
        for(int x:unionRes){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Intersection of two arrays");
        for(int x:intersectRes){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static HashSet<Integer> UnionArray(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        HashSet<Integer> res = new HashSet<>();
        for(int x:arr1){
            res.add(x);
        }
        for(int x:arr2){
            res.add(x);
        }
        return res;
    }

    public static HashSet<Integer> IntesectArray(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr1){
            set.add(x);
        }
        for(int x:arr2){
            if(set.contains(x)){
                res.add(x);
            }
        }
        return res;
    }
}
