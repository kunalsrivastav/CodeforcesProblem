/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 04-07-2021
 *   Time: 20:25
 *   File: TwoBagsOfPotatoes.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/239/A
 * */

public class TwoBagsOfPotatoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        boolean printed = false;
        for (int i = k; i <= n; i += k) {
            if (i > y) {
                System.out.print((i - y) + " ");
                printed = true;
            }
        }
        if (!printed) {
            System.out.println(-1);
        }
    }
}