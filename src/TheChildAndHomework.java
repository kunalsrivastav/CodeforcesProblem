/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 04-07-2021
 *   Time: 22:21
 *   File: TheChildAndHomework.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/437/A
 * */

public class TheChildAndHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = new String[4];
        for (int i = 0; i < s.length; i++) {
            s[i] = scanner.nextLine();
        }
        int[] arrayLength = {s[0].length() - 2, s[1].length() - 2, s[2].length() - 2, s[3].length() - 2};
        Arrays.sort(arrayLength);
        boolean hasMin = false, hasMax = false;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        if (arrayLength[0] <= arrayLength[1] / 2) {
            hasMin = true;
            min = arrayLength[0];
        }
        if (arrayLength[3] >= arrayLength[2] * 2) {
            hasMax = true;
            max = arrayLength[3];
        }
        if (hasMax == hasMin) {
            System.out.println("C");
        } else if (hasMin) {
            for (int i = 0; i < s.length; i++) {
                if (min == s[i].length() - 2) {
                    System.out.println(s[i].charAt(0));
                    break;
                }
            }
        } else if (hasMax) {
            for (int i = 0; i < s.length; i++) {
                if (max == s[i].length() - 2) {
                    System.out.println(s[i].charAt(0));
                    break;
                }
            }
        }
    }
}