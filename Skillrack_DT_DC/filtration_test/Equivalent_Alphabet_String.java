package filtration_test;

import java.util.*;

public class Equivalent_Alphabet_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S = sc.nextLine();
        char str[]=S.toCharArray();


        int i = 0;
        while (i < str.length) {
            // Check if next character is '#'
            if (i < str.length - 2 && str[i + 2] == '#') {
                // Two-digit number followed by '#'
                int num = (str[i] - '0') * 10 + (str[i + 1] - '0');
                if (num >= 1 && num <= 26) {
                    System.out.print((char) ('A' + num - 1));
                    i += 3;
                }else{
                    // If the number is not valid, print as lowercase
                    System.out.print((char) ('a' + (str[i] - '0') - 1));
                    i++;
                }
                
            } else if (i < str.length - 1 && str[i + 1] == '#') {
                // Single-digit number followed by '#'
                int num = str[i] - '0';
                if (num >= 1 && num <= 9) {
                    System.out.print((char) ('A' + num - 1));
                }
                i += 2;
            } else {
                // No hash — lowercase letter
                int num = str[i] - '0';
                if (num >= 1 && num <= 9) {
                    System.out.print((char) ('a' + num - 1));
                }
                i++;
            }
        }
    



    } 
}















// Equivalent Alphabet String:

//     The integer values from 1 to 26 denotes lower case alphabets. If they are followed by
//     a hash they denote upper case alphabets. The program must print the equivalent
//     alphabet string.

// Example Input/Output 1:
// Input:
// 29#1#5

// Output:
// blAe

//input:
// 29#523#6#
// Output:


// Max Execution Time Limit: 50 millisec