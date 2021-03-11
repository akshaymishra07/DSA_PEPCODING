/*Problem:
*
*   1. You are given a number n, representing the size of array a.
    2. You are given n numbers, representing elements of array a.
    3. You are given a number k.
    4. Rotate the array a, k times to the right (for positive values of k), and to
       the left for negative values of k.
*
*
* */

package arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void printArray(int[] arr){
        for(int item : arr){
            System.out.print(item+" ");
        }
    }

    public static void indexedReverse(int[] arr, int i, int j){
        int start = i;
        int end = j;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr, int k){
        k = k % arr.length;
        if(k<0){
            k = k+arr.length;
        }

        indexedReverse(arr , 0 , arr.length-k-1);
        indexedReverse(arr, arr.length-k, arr.length-1);
        indexedReverse(arr, 0 , arr.length-1);

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }

        rotateArray(arr,k);
        printArray(arr);

    }
}
