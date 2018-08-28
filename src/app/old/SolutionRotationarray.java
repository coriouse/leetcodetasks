package app.old;

import java.util.Arrays;

public class SolutionRotationarray {
    public static void main(String[] args) {

        int[] arr  = {1,2,3,4,5,6};




        System.out.println(Arrays.toString(arr));


        int head = arr[0];

        for (int i = 0; i <= arr.length-2; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = head;

        System.out.println(Arrays.toString(arr));


    }
}
