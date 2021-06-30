/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 30-06-2021
 *   Time: 20:09
 *   File: MinimumDifficulty.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/496/A
 * */

public class MinimumDifficulty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int minimum = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int maximum = 0;
            for (int j = 0; j < n - 1; j++) {
                int diff = 0;
                if (j == i) {
                    continue;
                } else if (j + 1 == i) {
                    diff = Math.abs(array[j + 2] - array[j]);
                } else {
                    diff = Math.abs(array[j + 1] - array[j]);
                }
                maximum = Math.max(maximum, diff);
            }
            minimum = Math.min(minimum, maximum);
        }
        System.out.println(minimum);
    }
}