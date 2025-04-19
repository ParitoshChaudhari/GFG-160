package ArrayQuestions;

public class Day2_move_all_zeros_to_end {

    static void moveZeroes(int[] arr){
        // Time complexity -> O(n^2)
        int n = arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    static void pushZeroesToEnd(int[] arr){
        // Time complexity -> O(n)
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }


    public static void main(String[] args){
//        int[] arr = {0,2,0,4,3,0,5,0};
        int[] arr = {3,5,0,0,1,8};
//        moveZeroes(arr);
        pushZeroesToEnd(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
