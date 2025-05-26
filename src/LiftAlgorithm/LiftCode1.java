package LiftAlgorithm;
import java.util.*;
public class LiftCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNoOfFloors = sc.nextInt();

        // condition that building must have atleast one floor
        if(totalNoOfFloors < 1){
            System.out.println("Building must have atleast 1 floor");
            return;
        }

        // let us assume that the lift is initially at ground floor (0)
         int currentFloor = 0;

        while(true){
            System.out.println("Current floor : " + currentFloor);
            System.out.println("Press the target floor -> 0 - "+(totalNoOfFloors-1) +" or -1 to exit");
            int targetFloor = sc.nextInt();

            if(targetFloor == -1){
                System.out.println("Shutting down lift");
            }


        }

    }
}
