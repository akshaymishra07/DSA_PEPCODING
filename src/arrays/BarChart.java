package arrays;

import java.util.Scanner;

public class BarChart {
    public static int findMax(int arr[]){
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
        }

        int max = findMax(arr);

        for(int floor = max ; floor >= 1; floor--){
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= floor){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
