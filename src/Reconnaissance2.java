/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 21:52
 *   File: Reconnaissance2.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/34/A
 * */

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index1 = 1, index2 = 2;
        int min = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < min) {
                min = diff;
                index1 = i + 1;
                index2 = i + 2;
            }
        }
        int lastDiff = Math.abs(arr[0] - arr[n - 1]);
        if (lastDiff < min) {
            index1 = 1;
            index2 = n;
        }
        System.out.println(index1 + " " + index2);
    }
}