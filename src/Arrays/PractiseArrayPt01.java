package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PractiseArrayPt01 {

    public static void main(String[] args) {

//        int[] myIntArray = new int[10];
//        //  The size of an array, once created it's fixed.
//
//        myIntArray[5] = 50;
//
//        double[] myDoubleArray = new double[10];
//        myDoubleArray[2] = 3.5;
//        System.out.println(myDoubleArray[2]);
//
//        //  The Array initializer
//
//        int[] firstFivePositives = {1, 2, 3, 4, 5};
////        String[] names = {"Andy", "Bob", "Charlie", "David", "Eve"};
//        for(int i = 0; i < firstFivePositives.length; i++){
//            System.out.println(firstFivePositives[i]);
//        }

//        System.out.println(firstFivePositives[firstFivePositives.length - 1]);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");

        int[] newArray = new int[input.nextInt()];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = input.nextInt();
        }

//        for (int i = 0; i < newArray.length; i++){
//            System.out.print(newArray[i] + " ");
//        }

        //  Enhanced for loop
//        for (int i : newArray){
//            System.out.print(i + " ");
//        }

        System.out.println(Arrays.toString(newArray));

    }

}
