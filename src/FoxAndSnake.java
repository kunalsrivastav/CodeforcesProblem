/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 23-05-2021
 *   Time: 20:50
 *   File: FoxAndSnake.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/510/A
 * */

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i & 1) == 1) {
                    System.out.print("#");
                } else if (i % 4 == 0) {
                    if (j == 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                } else {
                    if (j == m) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}