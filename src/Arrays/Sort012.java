package Arrays;
import java.util.*;
public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count0=0, count1=0,count2=0;
        for(int x:arr){
            switch (x){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        int i=0;
        while(count0!=0){
            arr[i]=0;
            count0--;
            i++;
        }
        while(count1!=0){
            arr[i]=1;
            count1--;
            i++;
        }
        while(count2!=0){
            arr[i]=2;
            count2--;
            i++;
        }

        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
