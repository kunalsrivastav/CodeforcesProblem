/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 01-07-2021
 *   Time: 12:42
 *   File: PerfectPermutation.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/233/A
 * */

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print((i - 1) + " ");
                } else {
                    System.out.print((i + 1) + " ");
                }
            }
        }
    }
}