/*  Problem : Given an array of size n , calculate the span of the array

              span = diff(maxElement in array , minElement in array)

              input: 6
                     15 30 40 4 11 9


              output: 36
* */
package arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static int calculateSpan(int arr[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int item : arr){
            if(item > maximum){
                maximum = item;
            }
            if(item < minimum){
                minimum = item;
            }
        }
        return maximum - minimum;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
        }
        int span = calculateSpan(arr);

        System.out.println(span);
    }
}
