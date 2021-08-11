/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 11-08-2021
 *   Time: 01:14
 *   File: FindMarble.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/285/B
 * */

public class FindMarble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int pos = s;
        boolean possible = true;
        while (pos != t) {
            pos = arr[pos];
            count++;
            if (pos == s) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? count : -1);
    }
}