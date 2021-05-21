/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 22:33
 *   File: AntonAndLetters.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/443/A
 * */

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] countArray = new int[26];
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                countArray[s.charAt(i) - 97]++;
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (countArray[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}