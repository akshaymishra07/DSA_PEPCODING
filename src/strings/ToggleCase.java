/*
 * Problem : given a string , toggle the case of the characters of this string
 *
 * input: pepCODING
 * output: PEPcoding
* */
package strings;

import java.util.Scanner;

public class ToggleCase {

    //This solution uses the library functions of Strings which might not be acceptable
    //to some of the interviewers.
    public static String toggleCase(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                result += Character.toLowerCase(str.charAt(i));
            }
            else
                result += Character.toUpperCase(str.charAt(i));
        }
        return result;
    }

    //This solution uses the pure logic without using any lib functions
    /*
    *    if we get an upper case char(ch) we will toggle it to lower case char (lch) using the formula
    *       lch = 'a' + ch - 'A';
    *
    *    if we get an lower case char(ch) we will toggle it to upper case char (uch) using the formula
    *       uch = 'A' + ch - 'a';
    *
    *
    * */
    public static String toggleWithoutLibFunc(String str){
        StringBuffer sb = new StringBuffer(str);

        for(int i = 0 ; i < sb.length() ; i++) {
            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char uch = (char) ('A' + ch - 'a');
                sb.setCharAt(i, uch);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lch = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        //System.out.println(toggleCase(str));
        System.out.println(toggleWithoutLibFunc(str));
    }
}
