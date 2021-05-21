/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 22-05-2021
 *   Time: 00:29
 *   File: DreamoonAndStairs.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/476/A
 * */

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n < m) {
            System.out.println(-1);
        } else {
            int minSteps = Integer.MAX_VALUE;
            for (int x = 0; x <= n / 2; x++) {
                for (int y = 0; y <= n; y++) {
                    if ((2 * x) + y == n && (x+y) % m == 0) {
                        minSteps = Math.min(minSteps, x+y);
                    }
                }
            }
            System.out.println(minSteps);
        }
    }
}