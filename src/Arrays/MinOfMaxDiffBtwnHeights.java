package Arrays;
import java.util.*;
public class MinOfMaxDiffBtwnHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }
//        display(arr);
        int k = sc.nextInt();
        Collections.sort(arr);
//        display(arr);
        for(int i=0;i<arr.size();i++){
            if((arr.get(i)-k) >= 0 ){
                arr.set(i,arr.get(i) - k);
            }else {
                arr.set(i, arr.get(i) + k);
            }
        }
        System.out.println("Result : " + (arr.get(arr.size()-1) - arr.get(0)));
    }
    /*public static void display(ArrayList<Integer>arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }*/
}
