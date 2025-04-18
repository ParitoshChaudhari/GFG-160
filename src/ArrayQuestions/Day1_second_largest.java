package ArrayQuestions;
import java.util.Arrays;

public class Day1_second_largest {

    public static int getSecondLargest(int[] arr) {
        // Approach - 1
        if(arr.length < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest ;
    }


    public static int getSecondLargest2(int[] arr) {
        // Approach -> 2
        if(arr.length < 2){
            return -1;
        }

        Arrays.sort(arr);
        return arr[arr.length-2];
    }


    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
        int[] arr = {12,35,1,10,34,1};

        // Approach -> 1
        System.out.println(getSecondLargest(arr));

        // Approach -> 2
        System.out.println(getSecondLargest2(arr));
    }
}
