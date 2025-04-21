package ArrayQuestions;

import java.util.Arrays;

public class Day4_Rotate_array {

    static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5};
//        rotate(arr,2);
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
