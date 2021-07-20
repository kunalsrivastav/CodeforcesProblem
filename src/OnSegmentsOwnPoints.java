/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 20-07-2021
 *   Time: 23:33
 *   File: OnSegmentsOwnPoints.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/397/A
 * */

public class OnSegmentsOwnPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lArr = new int[n];
        int[] rArr = new int[n];
        for (int i = 0; i < n; i++) {
            lArr[i] = scanner.nextInt();
            rArr[i] = scanner.nextInt();
        }
        if (n == 1) {
            System.out.println(rArr[0] - lArr[0]);
        } else {
            boolean[] used = new boolean[100 + 1];
            for (int i = lArr[0]; i < rArr[0]; i++) {
                used[i] = true;
            }
            for (int i = 1; i < n; i++) {
                for (int j = lArr[i]; j < rArr[i]; j++) {
                    used[j] = false;
                }
            }
            int count = 0;
            for (int i = lArr[0]; i < rArr[0]; i++) {
                if (used[i] == true) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}