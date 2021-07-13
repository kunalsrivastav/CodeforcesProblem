/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 13-07-2021
 *   Time: 17:33
 *   File: Sockets.java
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/257/A
 * */

public class Sockets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (m <= k) {
            System.out.println(0);
        } else {
            Arrays.sort(arr);
            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                count++;
                int val = arr[i];
                if (k == 1 && m > arr[i]) {
                    k = val;
                    continue;
                }
                k--;
                m -= val;
                if (m <= k || m == 0 || k == 0) {
                    break;
                }
            }
            if (m <= k) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}