package ArrayQuestions;

import java.util.Arrays;

public class Day5_Next_permutation {
    public static void nextPermutation(int[] arr) {

        int pivot = -1;
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }


        if(pivot == -1) {
            reverse(arr,0,arr.length-1);
            return;
        }

        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] > arr[pivot]) {
                swap(arr,i,pivot);
                break;
            }
        }

        reverse(arr, pivot + 1, arr.length - 1);

    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr,start++,end--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
