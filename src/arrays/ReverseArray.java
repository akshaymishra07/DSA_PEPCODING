/*PROBLEM : Given an array of size n , reverse the array
*
* note : instead of printing in reverse order , the elements needs to be reversed on the memory level as well
* */


package arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void printArray(int arr[]){
        for(int item : arr){
            System.out.print(item+" ");
        }
    }

    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int arr[] = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
        }

        reverseArray(arr);
        printArray(arr);
    }
}
