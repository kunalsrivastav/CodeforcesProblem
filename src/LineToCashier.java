/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 04-07-2021
 *   Time: 23:00
 *   File: LineToCashier.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/408/A
 * */

public class LineToCashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] kArr = new int[n];
        for (int i = 0; i < n; i++) {
            kArr[i] = scanner.nextInt();
        }
        int minTime = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int totalTime = 0;
            for (int j = 0; j < kArr[i]; j++) {
                int val = scanner.nextInt();
                totalTime += (val * 5);
            }
            totalTime += (kArr[i] * 15);
            minTime = Math.min(minTime, totalTime);
        }
        System.out.println(minTime);
    }
}