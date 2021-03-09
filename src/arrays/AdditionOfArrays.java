/*
Problem : Given 2 arrays , do the sum of the arrays in the arithmetic sum fashion

e.g
   input1: 5 4
          9 3 4 6 8
          1 9 8 8

    output1:
          9 5 4 5 6

    input2: 3 2
            9 9 9
            2 8

     output2:
            1 0 2 7

*/

package arrays;

import java.util.Scanner;

public class AdditionOfArrays {

    public static void printArray(int arr[]){
        for(int item : arr){
            System.out.print(item+" ");
        }
    }

    public static int[] sumOfArrays(int array1[] , int array2[]){
        int sum[] = new int[array1.length > array2.length ? array1.length : array2.length ];
        int i = array1.length-1;
        int j = array2.length-1;
        int k = sum.length-1;
        int c = 0;

        while(k >= 0 ){
            int d = c;

            if(i >= 0){
                d += array1[i];
            }
            if(j >= 0){
                d += array2[j];
            }

            c = d/10;
            d = d%10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.print(c+" ");
        }
        return sum;
    }

    public static void main(String args[]){
       Scanner kb = new Scanner(System.in);
       int n1 = kb.nextInt();
       int n2 = kb.nextInt();
       int array1[] = new int[n1];
       int array2[] = new int[n2];

       for(int i = 0 ; i < n1 ; i++){
           array1[i] = kb.nextInt();
       }
        for(int i = 0 ; i < n2 ; i++){
            array2[i] = kb.nextInt();
        }
        int sum[] = sumOfArrays(array1 , array2);
        printArray(sum);
    }
}
