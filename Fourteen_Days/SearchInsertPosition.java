import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scn  =new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        searchInsertPostion(arr, data);
        scn.close();
    }

    public static void searchInsertPostion(int[] arr, int data) {
        if(arr == null){
           System.out.println("0");
        }
        if (data <=arr[0]) {
            System.out.println("0");
        }

        for (int i = 0; i < arr.length; i++) {
            if (data > arr[i] && data <= arr[i+1]) {
                System.out.println(i+1);
            }
        }
    }
}
