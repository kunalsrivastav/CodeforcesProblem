/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 20-02-2021
 *   Time: 00:01
 *   File: HelpfulMaths.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/339/A
 * */

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        if (length > 2) {
            int[] array = new int[(length + 1) / 2];
            int arrayIndex = 0;
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) != '+') {
                    array[arrayIndex++] = Character.getNumericValue(s.charAt(i));
                }
            }
            // Sorting the Array
            Arrays.sort(array);
            arrayIndex = 0;
            for (int i = 0; i < (length + 1) / 2; i++) {
                System.out.print(array[arrayIndex++] + "" + ((i < (length / 2)) ? "+" : ""));
            }
        } else {
            System.out.println(s);
        }
    }
}