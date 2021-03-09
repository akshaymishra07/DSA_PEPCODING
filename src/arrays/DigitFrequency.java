/* Problem : Given an Integer and a digit , count the frequency of the digit in the integer

            input  1 : 545356 5
            output 1 : 3

            input  2: 1000000 9
            output 2: 0


* */

package arrays;

import java.util.Scanner;

public class DigitFrequency {

    public static int countFrequency(int number , int digit){
        int count = 0 ;

        while(number > 0){
            if(number % 10 == digit){
                count++;
            }
            number/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int number = kb.nextInt();
        int digit  = kb.nextInt();

        int frequency = countFrequency(number, digit);

        System.out.println(frequency);
    }
}
