/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 06-07-2021
 *   Time: 21:45
 *   File: Table.java
 */

import java.util.Scanner;

/**
 * Question - https://codeforces.com/problemset/problem/359/A
 * */

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean sides = false, center = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && ((i == 0) || (i == (n - 1)) || (j == 0) || (j == (m - 1)))) {
                    sides = true;
                }
                if (arr[i][j] == 1) {
                    center = true;
                }
            }
        }
        if (sides) {
            System.out.println(2);
        } else if (center) {
            System.out.println(4);
        }
    }
}