/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 21-05-2021
 *   Time: 21:00
 *   File: Puzzles.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/337/A
 * */

public class Puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int diff = arr[i + n - 1] - arr[i];
            min = Math.min(min, diff);
        }
        System.out.println(min);
    }
}