package ArrayQuestions;

import java.util.Arrays;

public class Day3_Reverse_a_array {
    static void reverseArray(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,4,3,2,6,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
