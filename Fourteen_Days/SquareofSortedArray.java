import java.util.Arrays;
import java.util.Scanner;

public class SquareofSortedArray {

    // public static void squareSortArray(int[] arr) {
    //    for (int ele : arr) {
    //     ele*=ele;
        

    //     System.out.println(ele);
    //    }
       
    // }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
        k= scn.nextInt();
        arr[i]=k*k;
           
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);  
        }

        // squareSortArray(arr);
        scn.close();
       
    }

   
}
