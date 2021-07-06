/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 20:48
 *   File: Soroban.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/363/A
 * */

public class Soroban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[String.valueOf(n).length()];
        Arrays.fill(s, "");
        for (int i = 0; i < s.length; i++) {
            int val = n % 10;
            if (val < 5) {
                s[i] += "O-|";
            } else {
                s[i] += "-O|";
            }
            int count = 0;
            for (int j = 0; j < val % 5; j++) {
                s[i] += "O";
                count++;
            }
            s[i] += "-";
            for (int j = 0; j < 4 - count; j++) {
                s[i] += "O";
            }
            n = n / 10;
        }
        for (String value : s) {
            System.out.println(value);
        }
    }
}